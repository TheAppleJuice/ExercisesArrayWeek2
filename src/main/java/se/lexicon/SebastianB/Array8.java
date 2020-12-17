package se.lexicon.SebastianB;

import java.util.Arrays;

/*
8. Write a program which will remove the duplicate elements
of a given array [20, 20, 40, 20, 30, 40, 50, 60, 50].

Expected output: Array: 20 20 40 20 30 40 50 60 50
Array without duplicate values: 20 40 30 50 60

 */
public class Array8 {
    //Method for sorting array.
    //Method search array for duplicate elements.
    //Method remove duplicates elements from array.
    //Method for new array with out duplicates.


    public static void main(String[] args) {
        int [] array = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        Arrays.sort(array);
        int len = array.length;
        int j = 0;

        for (int i=0; i < len - 1; i++){
            if (array[i] !=array[i+1]){
                array[j++] =array[i];
            }
        }
        array[j++] = array[len - 1];

for (int k =0; k< j; k++){
    System.out.print(array[k] +" ");
}


    }

}
