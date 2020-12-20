package se.lexicon.SebastianB;
/*
10.
Write a program which will represent multiplication table
stored in multidimensional array.
Hint: You have two-dimensional array with values
[[1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10]]
 */
public class Array10 {

    //Build array.
    //Loops through row and column.
    //condition for addition of row * column.
    //Build array of products from addition.
    //Print new product array.

    public static void main(String[] args) {
        int[][] array1 = new int[10][10];

        array1 = multiplication(10,10);

// row = i, column = j.
        for (int i = 0; i < array1.length ; i++)
        {
            for (int j = 0; j < array1[i].length; j++)
            {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();

        }
    }

    public static int[][] multiplication(int x, int y)
    {
        int [][] array2 = new int[x][y];
        for (int i = 0; i < array2.length ; i++)
        {
            for (int j = 0; j < array2[i].length; j++)
            {
                //Array multiplication
                array2[i][j] = (i+1)*(j+1);
            }

        }
        //New array to store the product of the multiplication of array
        return array2;
    }


}


