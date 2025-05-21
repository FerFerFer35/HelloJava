package com.lfernando.basic;

public class Operators {
    public static void main(String[] args) {
        //Java has the following groups of operators:
        //Arithmetic operators
        //Assignment operators
        //Comparison operators
        //Logical operators
        //Bitwise operators

        //Arithmetics operators
        int sum = 5 + 5; //Operator +
        int subtraction = 10 - 5; //Operator -
        int multiplication = 10 * 10; //Operator *
        int division = 20 / 10; //Operator /
        int modulo = 20 % 10; //Operator %

        //Assignment operators
        int value = 1000; //Operator =
        value += 100; //Operator +=
        value -= 100; //Operator -=
        value *= 100; //Operator *=
        value /= 100; //Operator /=
        value %= 100; //Operator %=
        value &= 100; //Operator &=
        value |= 100; //Operator |=
        value ^= 100; //Operator ^=
        value >>= 100; //Operator >>=
        value <<= 100; //Operator <<=

        //Comparison operators
        int x = 10;
        int y = 5;
        System.out.println(x == y); //Operator == equal to
        System.out.println(x != y); //Operator != not equal
        System.out.println(x > y); //Operator > greater than
        System.out.println(x < y); //Operator < less than
        System.out.println(x >= y); //Operator >= greater than or equal to
        System.out.println(x <= y); //Operator <= less than or equal to

        //Logical operators
        System.out.println(x < 5 && x < 10); //Operator &&
        System.out.println(x >= 5 || x < 10); //Operator ||
    }
}
