This repository contains data and code for the evaluation of the reference structure approach for the TSE paper.

The structure of the repository is as follows:  
* casestudies: the data for all four case studies  
  * mrs.diagrams: the Modular EMF Designer diagrams for all case studies  
  * \<case study name\>  
    * data.\<case study name\>.evolution:  
        evolution scenarios (input for the evolvability evaluation).  
        The evolution scenarios are stored in their separate folders, which contain a mod.txt and optionally a desc.txt file.  
        The mod.txt contains the names of classes that are affected by the scenario.  
        Generic scenarios only affect one class (see the TSE paper or the doctoral thesis of Misha Strittmatter for an explanation).  
        Other scenario types affect one or more classes.  
        A desc.txt file describes the evolution scenario.  
        Generic scenarios do not need descriptions (see the TSE paper or the doctoral thesis of Misha Strittmatter for an explanation) and, therefore, do not feature desc.txts.  
        A desc.txt has the following structure.  
            first line: evolution scenario types  
            second line: explanation what happens in the scenario  
            third line: link to a version history entry (optional)  
        In the PCM case study the evolution folder is replace by "...extension" and "...modification" folders, as it analyses extensions and explicitly distinguishes between the two evolution types.  
    * data.\<case study name\>.models: instances of the original metamodel of the case study (input for the utilization evaluation)  
    * data.\<case study name\>.results:  
        Contains the results for both evaluations.  
        The results are summarized in csv files.  
        The first row in these files contains the header.  
        It contains the names of the columns.  
      * Evo:  
          Contains results for the evolvability evaluation (for the PCM this is split in Mod and Ext for modification and extension scenarios).  
          For the evolvability evaluation, two summary files exist.  
          "summary.csv" contains the results for each individual evolution scenario.  
          "summary classes.csv" contains the results for the result classes.  
          A result class represents all scenarios that produce the same result.  
          "result classes.txt" specifies which scenarios are grouped in the result classes.  
          Both csv files have the following columns:  
            Scenario: name of the scenario or result class  
            Metamodel: prefix of the metamodel as specified in the GUI  
            Metric: name of the metric  
            Value: value of the measurement  
      * Util:  
          Contains the results for the metamodel utilization evaluation.  
          "summary.csv" features the following columns:  
            Mode:  
              Specifies whether all model files in a folder were analyzed together ("Full"), or if a single model file was analyzed ("Single").  
              In my dissertation only the "Single" mode results are used.  
            Model: Name of the folder that contains the model files.  
            Resource:  
              Name of the file that is being analyzed in "Single" mode.  
              Has no meaning for the "Full" mode and always contains the name of the alphabetically first model file in that mode.  
            Metamodel: name of the metamodel that is analyzed.  
            Util: value of the utilization metric  
    * metamodel  
      * original: the initial version  
      * refactored: version that I refactored according to my approach  
      * shared: metamodel modules that are unaltered and used by the original and refactored metamodel (not for every case study)  
* evaluationtooling: code for the tool (for installation and usage instructions, see the appendix of the doctoral thesis of Misha Strittmatter)  
  * emfrefactorresultconverter: converts the xml based export results from EMF Refactor into csv  
  * metamodelassessor: Eclipse plugin to automate the evolvability and metamodel utilization evaluations  
  * metamodelassessor.aet: this plugin is used by the metamodelassessor to call the Architecture Evaluation Tool (of Reiner Jung)  
  * metamodelassessor.manualtests: models that I used only for testing  
  * metamodelassessor.ui: user interface  
