package com.lfernando.basic;

public class JavaStringsEx {
    public static void main(String[] args) {
        //Strings are used for storing a text, for example:
        String word = "Hello World!";
        //This String is actually an object an allow call methods, for example:
        int wordLength = word.length(); //Store Integer value

        //More methods can be used
        System.out.println(word.toUpperCase()); //Print: HELLO WORLD!
        System.out.println(word.toLowerCase()); //Print: hello world!

        //Finding a character in a String
        //Return the index or position of the first occurrence
        System.out.println(word.indexOf("Hello")); //In the first position / 0

        //Concatenation
        //For concat two or more Stings use the sign +, for example:
        String name = "Fernando ";
        String surname = "Bautista";
        System.out.println(name + surname);
        //We can also use the concat method for concat two strings, for example:
        System.out.println(name.concat(surname));

        //Warning: The sign + is used to addition and concatenation
    }
}
