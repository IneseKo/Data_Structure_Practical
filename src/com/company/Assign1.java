package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Assign1 {

    public static void main(String[] args) {
        ArrayList<String> arrOne = new ArrayList<>(Arrays.asList("Computer", "Plate", "Chair", "Girl", "Boy", "Cat", "Dog", "Shirt", "Determination"));
                startswithC(arrOne);
        endswithE(arrOne);
        nameLengthIs5(arrOne);
        subStringTe(arrOne);
        histogram(arrOne);
    }
    public static void startswithC(ArrayList<String> arrOne) {
        int count = 0;

        for (int i = 0; i < arrOne.size(); i++) {
            if (arrOne.get(i).startsWith("C")) {
                count++;
            }
        }
        System.out.println("\nThere are " + count + " words in the Array that start with a \"C\".\n");
    }

    public static void endswithE(ArrayList<String> arrOne) {
        int count = 0;

        for (int i = 0; i < arrOne.size(); i++) {
            if (arrOne.get(i).endsWith("e")) {
                count++;
            }
        }
        System.out.println("\nThere are " + count + " words in the Array that ends with an \"e\".\n");
    }

    public static void nameLengthIs5(ArrayList<String> arrOne) {
        int count = 0;

        for (int i = 0; i < arrOne.size(); i++) {
            if (arrOne.get(i).length() == 5) {
                count++;
            }
        }
        System.out.println("\nThere are " + count + " words in the Array that have 5 letters in their word.\n");
    }

    public static void subStringTe(ArrayList<String> arrOne) {
        int count = 0;

        for (int i = 0; i < arrOne.size(); i++) {
            if (arrOne.get(i).contains("te")) {
                count++;
            }
        }
        System.out.println("\nThere are " + count + " cases in the Array that have substring te.\n");
    }
    public static int maxWordLength(ArrayList<String> arrOne) {
        int maxWordLength = 0;
        for (int i=0; i<arrOne.size(); i++) {
            if (arrOne.get(i).length() > maxWordLength){
                maxWordLength = arrOne.get(i).length();
            }
        }
        return maxWordLength;
    }

    public static void histogram(ArrayList<String> arrOne) {

        int nameLength = 1;

        while (nameLength <= maxWordLength(arrOne)) {
            int wordAmount = 0;
            for (int i=0; i<arrOne.size(); i++) {
                if (arrOne.get(i).length() == nameLength) {

                    wordAmount++;
                }

            }
            System.out.println(wordAmount + " words in the Array that have the name length " + nameLength);
            nameLength++;
        }
    }
}
