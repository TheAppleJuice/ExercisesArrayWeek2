package se.lexicon.SebastianB;

import java.util.Arrays;

public class Array5 {
    /*
    5.
    Create a two-dimensional string array [2][2].
    Assign values to the 2d array containing any Country and City.
    Expected output:
    France Paris
    Sweden Stockholm
    * */

        public static void main (String[]args){
/*
        int [] testArray = new int[10];


        for (int i=0; i<testArray.length; i++){
            testArray[i]=i+1;
            System.out.println(testArray[i]);
        }

            System.out.println(Arrays.toString(testArray));

 */


        String[][] cityCountry = new String[2][2];

        cityCountry[0][0] = "France";
        cityCountry [0][1] = "Paris";

        cityCountry[1][0] = "Sweden";
        cityCountry[1][1] = "Stockholm";
//One way to do it


        for(String[] country : cityCountry){
            for (String value : country){
                System.out.print(value + " ");
            }
            System.out.println();
        }


/*

//Another way to do it
        for( int i=0; i < cityCountry.length; i++){
            for( int j=0; j < cityCountry.length; j++){

                System.out.print(cityCountry[i][j] + " ");
            }
            System.out.println();

            }


 */
        }


    }


