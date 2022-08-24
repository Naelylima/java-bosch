package Bosch;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite o valor da base do seu triangulo: ");
        double base = valor.nextDouble();
        System.out.println("Digite a altura do seu triangulo: ");
        double altura = valor.nextDouble();
        double area = (base*altura)/2;
        System.out.printf("A altura do seu triangulo é: %f",area);

    }
}
