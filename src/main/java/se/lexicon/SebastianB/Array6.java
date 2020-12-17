package se.lexicon.SebastianB;
/*
6.
Write a program which will set up an array to hold
the next values in this order: 43, 5, 23, 17, 2, 14
and print the average of these 6 numbers.
Expected output: Average is: 17.3
 */

public class Array6 {
    public static void main(String[] args) {
        double [] numbers = new double[]{43, 5, 23, 17, 2, 14};
        double sum = 0;

for (int i=0; i<numbers.length; i++)
    sum = sum + numbers[i];

        double average = sum / numbers.length;

        System.out.println(average);

    }
}
