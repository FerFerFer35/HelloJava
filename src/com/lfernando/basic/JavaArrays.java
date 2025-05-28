package com.lfernando.basic;

public class JavaArrays {
    public static void main(String[] args) {
        //An array is used to store multiple values, for example:
        String[] cars = {"Ford", "Mazda", "BMW"};
        //This array can only store strings, integers are not allowed
        //If you can store integers you need define the data type first:
        int[] nums = {1, 2, 3};
        //The same case, this array can not allow store strings

        //Multidimensional arrays
        int[][] myNumbers = { {1, 2, 3},
                              {5, 6, 7} };
        System.out.println(myNumbers[1][2]);
    }
}
