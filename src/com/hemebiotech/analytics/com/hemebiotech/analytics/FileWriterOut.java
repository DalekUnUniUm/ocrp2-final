package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterOut {

    private VariableBank variableBank;
    private String symptom ;

    public void setFileWriter() throws IOException{

        variableBank = new VariableBank();
        FileWriter writer = new FileWriter ("result.out");

        for(int i = 0 ; i < variableBank.getListSymptoms().size() ; i++){
            writer.write(" " + variableBank.getListSymptoms().get(i) + " " + variableBank.getNbrOccurency().get(i) + "\n" );
        }
        writer.close();
    }
}
