package com.lfernando.basic;

public class JavaSwitch {
    public static void main(String[] args) {
        //The switch statement is very similar to if statement, both selects the block of code will be executed
        //The syntax of the switch statement is:
        int option = 3;

        switch (option){
            case 1:
                System.out.println("Your option is 1");
                break;
            case 2:
                System.out.println("Your option is 2");
                break;
            case 3:
                System.out.println("Your option is 3");
                break;
            default:
                System.out.println("Your option is default");
        }
    }
}
