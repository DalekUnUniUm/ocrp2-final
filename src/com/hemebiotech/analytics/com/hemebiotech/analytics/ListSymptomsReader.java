package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ListSymptomsReader {

    private VariableBank variableBank ;
    private ListUniqueSymptomReader listUniqueSymptomReader ;

    ArrayList<String> mAllSymptom = new ArrayList<String>();
    public void getListSymptomReader() throws IOException {

        variableBank = new VariableBank();
        listUniqueSymptomReader = new ListUniqueSymptomReader();
        // first get input
        BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));
        String line = reader.readLine();

        while (line != null) {
            //System.out.println("symptom from file: " + line);
            mAllSymptom.add(line) ;
            line = reader.readLine();	// get another symptom
        }
        reader.close();

        variableBank.setListAllSymtoms(mAllSymptom);
        listUniqueSymptomReader.getUniqueSymptomReader();

    }
}
