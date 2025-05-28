import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Random rand = new Random();

        int intents = 0;

        ArrayList<Integer> list = new ArrayList<>();

        int num = rand.nextInt(100);
        System.out.println(num);

        while(num != 50){
            list.add(num);
            System.out.println("Lista: " + list);
            num = rand.nextInt(100);
            for(int number : list){
                if(number == num){
                    System.out.println("Encontramos un numero repetido");
                    System.out.println(number);
                }
            }
            System.out.println("Numero aleatorio: " + num);
            intents++;
            System.out.println("Intentos: " + intents);
        }
    }
}