package Bosch;

import java.util.Scanner;
//Fahrenheit para Celsius
public class Main {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        double fah = valor.nextDouble();
        double num = (fah - 32.0)*5/9;
        System.out.println(num);

//



    }
}
