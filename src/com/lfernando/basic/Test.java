package com.lfernando.basic;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Perro{
    String name;
    int age;

    Perro(String name, int age){
        this.name = name;
        this.age = age;
    }

    void indexS(){
        System.out.println("The dog " + name + " is " + age + " years old");
    }

    void indexM(){
        System.out.println("The dog " + name + " is " + age + " year old");
    }
}


public class Test {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String inputname = sc.nextLine();

        System.out.println("Digite seu age: ");
        int inputage = sc.nextInt();

        Perro perro = new Perro(inputname, inputage); // Crear el objeto solo una vez

        if (inputage == 1) {
            perro.indexM(); // Llama un método si es 1
        } else {
            perro.indexS(); // Llama otro método si no es 1
        }

        String word = "Porpose";
        StringBuilder reverseWord = new StringBuilder(word).reverse();
        System.out.println(reverseWord.toString());*/

        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("Luis", 23);
        System.out.println(myMap.get("Luis"));

    }
}
