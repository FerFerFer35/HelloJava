import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int limiter = 5;

        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            System.out.println("Ingresa un número para ingresar a la lista: ");
            int numero = sc.nextInt();
            list.add(numero);
            System.out.println(list);

            if(list.size() >= limiter){
                System.out.println("Has superado el limite en la lista");
                list.clear();
                System.out.println(list);
                break;
            }
        }
    }
}