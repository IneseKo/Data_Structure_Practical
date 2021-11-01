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
        experiment(arrOne);
        System.out.println(printSorted(arrOne));
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
        for (int i = 0; i < arrOne.size(); i++) {
            if (arrOne.get(i).length() > maxWordLength) {
                maxWordLength = arrOne.get(i).length();
            }
        }
        return maxWordLength;
    }

    public static void histogram(ArrayList<String> arrOne) {

        int nameLength = 1;

        while (nameLength <= maxWordLength(arrOne)) {
            int wordAmount = 0;
            for (int i = 0; i < arrOne.size(); i++) {
                if (arrOne.get(i).length() == nameLength) {

                    wordAmount++;
                }

            }
            System.out.println(wordAmount + " words in the Array that have the name length " + nameLength);
            nameLength++;
        }
    }

    public static ArrayList<String> printSorted(ArrayList<String> arrOne) {
        boolean sorted = false;
        String temp;
        int i = 0;

        System.out.println("Words in sorted order:");
        for(words : arrOne) {
            for (i=0; i < arrOne.size()-1; i++) {
                char first = arrOne.get(i).charAt(0);
                char second = arrOne.get(i+1).charAt(0);
                String element1 = arrOne.get(i);
                String element2 = arrOne.get(i+1);
                if (first > second) {
                    temp = element1;
                    arrOne.add(i, element2);
                    arrOne.add(i+1, temp);
                                      sorted = false;
                }
            }

        }
        return arrOne;
    }

    public static void experiment(ArrayList<String> arrOne){
        int i=0;
        char first = arrOne.get(i).charAt(0);
        char second = arrOne.get(i+1).charAt(0);
        if (first < second) {
            System.out.println(first + second);
        }
        System.out.println("second is and then first " + second + first);
    }
}
