package com.lfernando.intermediate;

public class JavaRecursion {


    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }

    public static void main(String[] args) {
        //This topic is some complex
        int result = sum(5, 10);
        System.out.println(result);
    }
}
