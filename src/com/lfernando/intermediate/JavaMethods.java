package com.lfernando.intermediate;

public class JavaMethods {
    //I´m here, I am a method
    static void sayHi(){
        System.out.println("Hello World");
    }

    //This example receive the parameter name
    static void sayHello(String name){
        System.out.println("Hello "+name);
    }

    //A method can receive more parameters
    static void myMethod(String name, int age){
        System.out.println("Hi, I´m " + name + " and I " + age + " years old.");
    }

    //Receiving n parameters
    static void myMethod2(int... numbers){
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        System.out.println("Total is " + total);
    }

    public static void main(String[] args) {
        //A method is block of code which only runs when it´s called
        sayHi();
        //This method is defined up

        //Also methods can receive parameter
        sayHello("Jose");

        //Receiving multiple parameters
        myMethod("Jose", 20);

        //Multiple parameters
        myMethod2(5, 10, 15, 20);
    }
}
