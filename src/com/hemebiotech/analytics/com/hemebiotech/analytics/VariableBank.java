package com.hemebiotech.analytics;

import java.util.ArrayList;

public class VariableBank {

    private static ArrayList<String> listSymptoms = new ArrayList<String>(); //List de symptomes uniques
    private static ArrayList<String> listAllSymtoms = new ArrayList<String>(); //Liste de tout les symptome venant du fichier texte
    private static ArrayList<Integer> nbrOccurency = new ArrayList<Integer>(); //Liste des occurences

    public static ArrayList<String> getListSymptoms() {
        return listSymptoms;
    }

    public static void setListSymptoms(ArrayList<String> listSymptoms) {
        VariableBank.listSymptoms = listSymptoms;
    }

    public static ArrayList<Integer> getNbrOccurency() {
        return nbrOccurency;
    }

    public static void setNbrOccurency(ArrayList<Integer> nbrOccurency) {
        VariableBank.nbrOccurency = nbrOccurency;
    }

    public static ArrayList<String> getListAllSymtoms() {
        return listAllSymtoms;
    }

    public static void setListAllSymtoms(ArrayList<String> listAllSymtoms) {
        VariableBank.listAllSymtoms = listAllSymtoms;
    }
}
