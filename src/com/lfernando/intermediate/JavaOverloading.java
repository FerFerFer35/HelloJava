package com.lfernando.intermediate;

public class JavaOverloading {

    //In this case we have two methods called "sum", but the first method adds two int´s and the second adds two double´s
    static void suma(int a, int b){
        System.out.println(a+b);
    }

    static void suma(double a, double b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        //Overloading means having multiple methods with the same name but different parameters
        //This method adds two int´s
        suma(10, 20);
        //And this method adds two double´s
        suma(15.5, 20.5);
    }
}
