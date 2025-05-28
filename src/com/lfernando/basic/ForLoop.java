package com.lfernando.basic;

public class ForLoop {
    public static void main(String[] args) {
        //I´m can´t explain this but here an example:
        //Syntax of the while loop: for (statement 1; statement 2; statement 3)
        for (int i = 1; i <= 50; i++) {
            System.out.println(i);
        }
        //This block of code prints numbers up to 50

        //Nested loops
        for (int base = 1; base <= 10; base++) {
            for (int multi = 1; multi <= 10; multi++) {
                System.out.println(base + " X " + multi + " = " + (base * multi));
            }
        }

        //For each loop is exclusive to loop through elements in an array
        //Syntax: for (type variableName : arrayName)
        String[] cars = {"Mazda", "Volvo", "Ford"};
        for (String car : cars) {
            System.out.println(car);
        }
        //For each element (car) in an array print the element
    }
}
