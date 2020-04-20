package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class CountSymptomReader {

    private VariableBank variableBank = new VariableBank();
    private FileWriterOut fileWriterOut = new FileWriterOut();

    private ArrayList<Integer> nbrOccurency = new ArrayList<Integer>();

    public void getCountReader() throws IOException{

        int countSymptoms = 0 ;

        for(int i = 0 ; i < variableBank.getListSymptoms().size() ; i++){

            countSymptoms = Collections.frequency(variableBank.getListAllSymtoms(), variableBank.getListSymptoms().get(i));

            nbrOccurency.add(countSymptoms);
        }

        variableBank.setNbrOccurency(nbrOccurency);
        fileWriterOut.setFileWriter();

    }
}
