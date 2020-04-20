package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ListUniqueSymptomReader {

    private VariableBank variableBank ;
    private CountSymptomReader countSymptomReader;

    private ArrayList<String> uniqueSymptomList = new ArrayList<String>();

    public void getUniqueSymptomReader() throws IOException {

        variableBank = new VariableBank();
        countSymptomReader = new CountSymptomReader();

        int symptomExist = 0 ;

        for(int i = 0 ; i < variableBank.getListAllSymtoms().size(); i++){

            symptomExist = Collections.frequency(uniqueSymptomList, variableBank.getListAllSymtoms().get(i));

            if(symptomExist == 0)
                uniqueSymptomList.add(variableBank.getListAllSymtoms().get(i));

        }

        Collections.sort(uniqueSymptomList);

        variableBank.setListSymptoms(uniqueSymptomList);

        for(int i = 0 ; i < variableBank.getListSymptoms().size();i++)
            System.out.println("Array = " + variableBank.getListSymptoms().get(i));

        countSymptomReader.getCountReader();

    }
}
