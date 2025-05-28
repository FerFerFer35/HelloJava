package com.lfernando.basic;

public class JavaBooleans {
    public static void main(String[] args) {
        /*The booleans only can store two values, for example:
        Yes - No
        0 - 1
        On - Off
        True - False
         */

        //For create a variable use the boolean keyword, for example:
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun); //Outputs true
        System.out.println(isFishTasty); //Outputs false

        //Boolean expression
        //Can we use comparison operators like: >, < or ==
        int x = 9;
        int y = 10;
        System.out.println(x > y); //Return false, 9 is lower than 10
        System.out.println(10 < 20); //Return true, because 10 is lower than 20
        System.out.println(y == 10); //Return true, because the value y is equal to 10
        System.out.println(x == 10); //Return false, because the value x is no equal to 10
        System.out.println(x != 10); //Return true because the value x is different to 10
    }
}
