package emfrefactorresultconverter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class EmfRefactorResultConverter {

    public static void main(String[] args) throws FileNotFoundException {
        String path = args[0];
        List<MetamodelResult> results = new ArrayList<MetamodelResult>();
        Set<String> smells = new LinkedHashSet<>();

        try {
            // Setup a new eventReader
            InputStream in = new FileInputStream(path);
            XMLInputFactory inputFactory = XMLInputFactory.newInstance();
            XMLEventReader eventReader = inputFactory.createXMLEventReader(in);

            MetamodelResult metamodelResult = null;

            // read the XML document
            while (eventReader.hasNext()) {
                XMLEvent event = eventReader.nextEvent();

                if (event.isStartElement()) {
                    StartElement startElement = event.asStartElement();
                    String elementName = startElement.getName().getLocalPart();

                    if (elementName.equals("result")) {
                        String metamodelName = null;
                        Iterator<?> attributes = startElement.getAttributes();
                        while (attributes.hasNext()) {
                            Attribute attribute = (Attribute) attributes.next();
                            if (attribute.getName().toString().equals("file")) {
                                metamodelName = attribute.getValue().split("\\.")[0];
                            }
                        }

                        metamodelResult = new MetamodelResult(metamodelName);
                        results.add(metamodelResult);
                    }

                    if (elementName.equals("smell")) {
                        String smellName = null;
                        int count = 0;
                        Iterator<?> attributes = startElement.getAttributes();
                        while (attributes.hasNext()) {
                            Attribute attribute = (Attribute) attributes.next();
                            String attributeName = attribute.getName().toString();
                            String attributeValue = attribute.getValue();
                            if (attributeName.equals("number")) {
                                count = Integer.parseInt(attributeValue);
                            } else if (attributeName.equals("name")) {
                                smellName = attributeValue;
                                smells.add(attributeValue);
                            }
                        }

                        metamodelResult.addSmellResult(smellName, count);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }

        StringBuilder csv = new StringBuilder();
        csv.append("Metamodel;");
        csv.append(smells.stream().collect(Collectors.joining(";")));
        csv.append('\n');
        for (MetamodelResult result : results) {
            csv.append(result.getMetamodelName());
            for (String smell : smells) {
                csv.append(';');
                csv.append(result.getSmellOccurence(smell));
            }
            csv.append('\n');
        }

        PrintWriter out = new PrintWriter(path + ".csv");
        out.println(csv);
        out.close();

        System.out.println("done");
    }

    private static class MetamodelResult {

        private String metamodelName;
        private Map<String, Integer> smellResults;

        public MetamodelResult(String metamodelName) {
            this.metamodelName = metamodelName;
            smellResults = new HashMap<>();
        }

        public String getMetamodelName() {
            return metamodelName;
        }

        public void addSmellResult(String smellName, int count) {
            smellResults.put(smellName, count);
        }

        public int getSmellOccurence(String smellName) {
            int occurence;
            Integer boxedOccurence = smellResults.get(smellName);
            if (boxedOccurence == null) {
                occurence = 0;
            } else {
                occurence = boxedOccurence;
            }
            return occurence;
        }
    }
}
