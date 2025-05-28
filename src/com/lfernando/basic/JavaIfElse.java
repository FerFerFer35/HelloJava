package com.lfernando.basic;

public class JavaIfElse {
    public static void main(String[] args) {
        /*The statement if is used to evaluate two or more values, for example*/
        int myAge = 22;

        if (myAge < 0){
            System.out.println("Age is negative");
        } else if (myAge > 1 && myAge <= 18){
            System.out.println("You are a child");
        } else if (myAge > 18 && myAge <= 22){
            System.out.println("You are a teenager"); //In this case this line of code will be executed
        } else if (myAge > 23 && myAge <= 100) {
            System.out.println("You are an adult");
        } else {
            System.out.println("Age is not valid");
        }

        //This program execute the line of code where the condition is true


        //Ternary operator, a way easier to execute a conditional
        //Syntax: variable = (condition) ? expressionTrue :  expressionFalse;

        int x = 5;
        int y = 10;
        String isGreaterThan = (x > y) ? "Yeah, is greater than" : "No is not";
        System.out.println(isGreaterThan);
    }
}
