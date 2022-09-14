package Bosch;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = entrada.nextInt();

        if (num %2 == 0){
            System.out.println("FIZZ");
        }
        else if (num %5 == 0){
            System.out.println("Buzz");
        }
        else  if (num %2 == 0 && num %5 == 0){
            System.out.println("FizzBuzz");
        }
        else {
            System.out.println("ERRO");
        }
    }
}
