package Bosch;

import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número para verificar se ele é par ou ímpar: ");
        int numero = entrada.nextInt();

        if (numero %2 ==0){
            System.out.printf("%d é par", numero);
        }
        else {
            System.out.printf("%d é impar",numero);
        }

    }
}
