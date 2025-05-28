package com.lfernando.basic;

public class WhileLoop {
    public static void main(String[] args) {
        //The while loop can execute code while the condition is true
        int i = 1;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        //When the condition is false the loop stop.

        //The do while loop is a variant of the while loop. Almost not used.
        int num = 1;
        do {
            System.out.println(num);
            num++;
        }while (num < 5);
        //The do while loop first increment and print the variable and then checks the condition.
    }
}
