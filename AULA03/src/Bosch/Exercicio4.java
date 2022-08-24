package Bosch;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double num1 = valor.nextDouble();
        double quadrado;
        double cubo;
        quadrado = Math.pow(num1,2);
        cubo = Math.pow(num1, 3);

        System.out.printf("Seu resultado ao Quadrado é:" +quadrado+"\nE ao cubo é "+cubo) ;


    }
}
