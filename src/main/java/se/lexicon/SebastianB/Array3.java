package se.lexicon.SebastianB;
/*
3. Write a program which will sort string array.
Expected output: String array: [Paris, London, New York, Stockholm]
Sort string array: [London, New York, Paris, Stockholm]
 */
import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        String [] cityNames =  {"Paris", "London", "New York", "Stockholm"};
        System.out.println(Arrays.toString(cityNames));

        Arrays.sort(cityNames);
            System.out.print(Arrays.toString(cityNames));


        }
    }

