package se.lexicon;

import java.util.Arrays;
import java.util.Collections;

public class ArraysUtilDemo {

    public static void main(String[] args) {
        String[] names = {"Simon", "erik", "Ulf", "Fredrik", "Jonas", "Kent", "Marcus", "Martina"};

        names = addNameToArray(names, "Mehrdad");
        names = addNameToArray(names, "Test");
        /*for (String element: names) {
            System.out.println(element);
        }*/
        System.out.println(Arrays.toString(names));

    }

    public static void ex1() {
        String[] names = {"Simon", "erik", "Ulf", "Fredrik", "Jonas", "Kent", "Marcus", "Martina"};
        //Arrays.sort(names);
        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
        for (String name : names) {
            System.out.println(name);
        }

        Integer[] numbers = {6, 8, 7, 4, 9, 11};
        Arrays.sort(numbers, Collections.reverseOrder());
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void ex2() {
        int[] numbers = {700, 900, 200, 4555, 34500, 445000, 600000};
        Arrays.sort(numbers);
        int position = Arrays.binarySearch(numbers, 900);
        System.out.println(position);
    }

    public static void ex3() {
        int[] numbers = {10, 20, 30, 40};

        int[] copeOfNumbers = Arrays.copyOf(numbers, numbers.length + 1); //  {10, 20, 30, 40, 0};
        // {10, 20, 30, 40, 50};
        copeOfNumbers[copeOfNumbers.length - 1] = 50;
        for (int number : copeOfNumbers) {
            System.out.print(number + " ");
        }
        // {10, 20, 30, 40, 50};
    }


    public static void ex4() {
        char[] letters = {'J', 'A', 'V', 'A'};
        char[] referenceToOriginalArray = letters;
        char[] copyOfOriginalArray = Arrays.copyOf(letters, letters.length);

        letters[0] = 'L';


        System.out.println("OriginalArray");
        for (char c : letters) {
            System.out.print(c + " ");
        }
        System.out.println("\n");

        System.out.println("ReferenceToOriginalArray");
        for (char c : referenceToOriginalArray) {
            System.out.print(c + " ");
        }
        System.out.println("\n");

        System.out.println("copyOfOriginalArray");
        for (char c : copyOfOriginalArray) {
            System.out.print(c + " ");
        }

    }

    public static String[] addNameToArray(String[] names, String newName) {
        String[] newArray = Arrays.copyOf(names, names.length + 1);
        newArray[newArray.length - 1] = newName;
        return newArray;
    }


}
