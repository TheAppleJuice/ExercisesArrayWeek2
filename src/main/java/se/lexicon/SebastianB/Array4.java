package se.lexicon.SebastianB;

import java.util.Arrays;

import static java.util.Arrays.*;

/*
4. Write a program which will copy the elements of
one array into another array.
Expected output:
Elements from first array: 1 15 20
Elements from second array: 1 15 20
 */
public class Array4 {
    public static void main(String[] args) {

        int [] array1 = new int[] {1, 15, 20};
        int [] array2 = new int[array1.length];

        for (int i=0; i<array1.length; i++) {
            array2[i] = array1[i];

        }

        System.out.println("Elements from first array: ");

        for (int i = 0; i<array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.println("Elements from second array: ");

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }




        }
}

