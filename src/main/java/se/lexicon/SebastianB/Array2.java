package se.lexicon.SebastianB;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int [] indexOf = {1,6,5,4,3,2};

        int indexFound = Arrays.binarySearch(indexOf, 5);
        int indexNotFound = Arrays.binarySearch(indexOf, 7);

        System.out.println(indexFound);
        System.out.println(indexNotFound);



    }
}
