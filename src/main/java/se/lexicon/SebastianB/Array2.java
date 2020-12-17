package se.lexicon.SebastianB;
/*
2. Create a program and create a method with name ‘indexOf’
which will find and return the index of an element in the array.
If the element doesn’t exist your method should return -1 as value.
Expected output: Index position of number 5 is: 2.

 */
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
