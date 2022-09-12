package Bosch;

import java.util.Scanner;
// Celsius para Fahrenheit
public class Exercio2 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite um valor:");
        double cel = valor.nextDouble();
        double num = (cel*9/5)+32;
        System.out.println(num);
    }
}
