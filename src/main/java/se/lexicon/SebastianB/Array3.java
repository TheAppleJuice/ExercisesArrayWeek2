package se.lexicon.SebastianB;

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        String [] cityNames =  {"Paris", "London", "New York", "Stockholm"};
        System.out.println("String array: " + Arrays.toString(cityNames));

        Arrays.sort(cityNames);
            System.out.print("Sort string array: " + Arrays.toString(cityNames));


        }
    }

