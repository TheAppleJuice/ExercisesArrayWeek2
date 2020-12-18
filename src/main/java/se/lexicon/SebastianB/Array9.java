package se.lexicon.SebastianB;

import java.util.Arrays;

/*
9. Write a method which will add elements in an array.
Remember that arrays are fixed in size so you need to
come up with a solution to “expand” the array.
*/
public class Array9 {

    public static void main(String[] args) {
        int [] array1 = {1,6,8};
        System.out.println(Arrays.toString(array1));
        System.out.println();
        int [] array2 = Arrays.copyOf(array1, array1.length + 4);
        array2 [3] = 5;
        array2 [4] = 10;
        array2 [5] = 34;
        array2 [6] = 9;

        for (int number : array2){
            System.out.print(number + " ");
        }

    }
}
