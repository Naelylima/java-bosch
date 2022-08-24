package Bosch;

import java.util.Scanner;

public class Exercico6 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite o valor de 'a': ");
        double a =valor.nextDouble();
        System.out.println("Digite o valor de 'b': ");
        double b = valor.nextDouble();
        System.out.println("Diite o valor de 'c': ");
        double c = valor.nextDouble();
        double del = Math.pow(b,2)-4*a*c;
        System.out.printf("O valor de delta é: %f",del);

    }
}
