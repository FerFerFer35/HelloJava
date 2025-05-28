package com.lfernando.basic;

public class JavaMath {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        //The first method is math max,and the example is:
        int maxValue = Math.max(x, y);
        System.out.println(maxValue);
        //Return the highest value of x and y

        //math min
        int minValue = Math.min(x, y);
        System.out.println(minValue);
        //Return the lowest value of x and y

        //math sqrt
        int randomValue = 81;
        int sqrtValur = (int) Math.sqrt(randomValue);
        System.out.println(sqrtValur);
        //Return the square root of a value

        //math absolute
        int negativeValue = -4;
        int absoluteValue = Math.abs(negativeValue);
        System.out.println(absoluteValue);
        //Return the absolute or positive value of a number

        //math random
        int randomNumber = (int) (Math.random() * 101);
        System.out.println(randomNumber);
    }
}
