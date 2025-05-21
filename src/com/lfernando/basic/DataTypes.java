package com.lfernando.basic;

public class DataTypes {
    public static void main(String[] args) {
        //Data type are divided into two groups
        //Primitive data types:
        byte myByte = 1; // -128 to 127
        short myShort = 1; // -32,768 to 32,767
        int myIntType = 1; // -2,147,483,648 to 2,147,483,647
        long myLongType = 1; // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float myFloatType = 1; // Sufficient for storing 6 to 7 decimal digits
        double myDoubleType = 1; // Sufficient for storing 15 to 16 decimal digits
        boolean myBoolType = true; // Stores true or false values
        char myCharType = 1; // Stores a single character/letter or ASCII values

        //Non-primitive data types:
        String myText = "Hello";
        //Arrays and classes

        //Example:
        int items = 20;
        double costPerItem = 6.99d;
        char currency = '$';
        double totalCost = costPerItem * items;

        System.out.println("Current items: " + items);
        System.out.println("Current cost per item: " + costPerItem);
        System.out.println("Total cost: " + totalCost + currency);
    }
}
