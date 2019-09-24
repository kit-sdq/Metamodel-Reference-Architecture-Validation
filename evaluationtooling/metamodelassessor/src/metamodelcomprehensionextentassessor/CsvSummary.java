package metamodelcomprehensionextentassessor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CsvSummary {

    private String head;
    private StringBuilder content = new StringBuilder();
    private List<ResultClass> resultClasses;

    public void append(String csvReport) {
        content.append(csvReport);
    }

    public void setHeadder(String head) {
        this.head = head;
    }

    @Override
    public String toString() {
        throw new RuntimeException("Don't use this!");
    }

    public void createResultClasses() {

        // break down report into a more processable data structure
        // Scenario -> Rows -> Cells
        List<List<String[]>> scenarios = transform(content);

        resultClasses = new ArrayList<CsvSummary.ResultClass>();

        // iterate scenarios
        for (int i = 0; i < scenarios.size(); i++) {
            List<String[]> iScenario = scenarios.get(i);
            String iScenarioName = getName(iScenario);

            ResultClass resultClass = new ResultClass(iScenarioName, iScenario);
            resultClasses.add(resultClass);

            // iterate subsequent scenarios
            for (int j = i + 1; j < scenarios.size();) {
                List<String[]> jScenario = scenarios.get(j);
                String jScenarioName = getName(jScenario);

                if (isDataIdentical(iScenario, jScenario)) {
                    resultClass.addScenario(jScenarioName);

                    scenarios.remove(j); // the current index has be processed a second time 
                } else {
                    j++;
                }
            }
        }
    }

    private boolean isDataIdentical(List<String[]> iScenario, List<String[]> jScenario) {

        // iterate rows
        for (int k = 0; k < iScenario.size(); k++) {
            String[] iRow = iScenario.get(k);
            String[] jRow = jScenario.get(k);

            // iterate cells
            // skip the first index, as it is the name of the scenario
            for (int l = 1; l < iRow.length; l++) {
                // compare cells
                String iCell = iRow[l];
                String jCell = jRow[l];
                if (!cellsAreIdentical(iCell, jCell)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean cellsAreIdentical(String iCell, String jCell) {
        try {
            // try parse double
            double d1 = Double.parseDouble(iCell);
            double d2 = Double.parseDouble(jCell);

            // cells contain doubles: check if they are very similar
            return similar(d1, d2);
        } catch (NumberFormatException e) {

            // string comparison
            return iCell.equalsIgnoreCase(jCell);
        }
    }

    public static boolean similar(double d1, double d2) {
        double threshold = 5E-9;
        return calcDifference(d1, d2) < threshold;
    }

    public static double calcDifference(double d1, double d2) {
        return Math.abs(d1 - d2) * 200 / (d1 + d2);
    }

    private List<List<String[]>> transform(StringBuilder content) {
        String[] rows = content.toString().split("\n");

        List<List<String[]>> scenarios = new ArrayList<List<String[]>>();
        String currentScenario = null;
        List<String[]> scenarioRows = null;
        for (String row : rows) {
            String[] rowsplit = row.split(";");

            // is this a new scenario?
            if (!rowsplit[0].equalsIgnoreCase(currentScenario)) {
                currentScenario = rowsplit[0];
                scenarioRows = new ArrayList<String[]>();
                scenarios.add(scenarioRows);
            }
            scenarioRows.add(rowsplit);
        }
        return scenarios;
    }

    private String getName(List<String[]> iScenario) {
        return iScenario.get(0)[0];
    }

    public String getFullReport() {
        return new StringBuilder().append(head).append('\n').append(content).toString();
    }

    public String getClassReport() {
        StringBuilder result = new StringBuilder();
        result.append(head).append('\n');
        for (ResultClass resultClass : resultClasses) {
            for (String[] row : resultClass.getData()) {
                int i = 0;
                for (String cell : row) {
                    result.append(cell);
                    if (i == 0) {
                        result.append(" (");
                        result.append(resultClass.getSize() + 1);
                        result.append(')');
                    }
                    if (i != row.length - 1) {
                        result.append(';');
                    }
                    i++;
                }
                result.append('\n');
            }
        }
        return result.toString();

        // return resultClasses.stream().map(ResultClass::getData).;
    }

    public String getResultClasses() {
        return resultClasses.stream().map(ResultClass::toString).collect(Collectors.joining("\n"));
    }

    private class ResultClass {
        private String name;
        private List<String> scenarios;
        private List<String[]> refData;

        public ResultClass(String name, List<String[]> refData) {
            this.name = name;
            this.refData = refData;
            scenarios = new ArrayList<String>();
        }

        public void addScenario(String name) {
            scenarios.add(name);
        }

        public List<String[]> getData() {
            return refData;
        }

        public int getSize() {
            return scenarios.size();
        }

        @Override
        public String toString() {
            return name + ": " + scenarios.stream().collect(Collectors.joining(", "));
        }
    }
}
