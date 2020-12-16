package se.lexicon.SebastianB;

import java.util.Arrays;

public class Array4 {
    public static void main(String[] args) {

        int[] numbers = {200,700,900,4555,34500,445000,500000};

        int indexFound = Arrays.binarySearch(numbers, 900);
        int indexNotFound = Arrays.binarySearch(numbers, 4450);

        System.out.println(indexFound);
        System.out.println(indexNotFound);


    }
}

