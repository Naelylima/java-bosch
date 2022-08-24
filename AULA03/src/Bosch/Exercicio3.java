package Bosch;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite seu peso:");
    double peso = entrada.nextDouble();
    System.out.println("Digite sua altura: ");
    double altura  = entrada.nextDouble();
    double imc= peso/(altura*altura);
        DecimalFormat f = new DecimalFormat();
        f.applyPattern(" #.00");
        System.out.printf("Seu IMC É %.2f",imc);


}
}
