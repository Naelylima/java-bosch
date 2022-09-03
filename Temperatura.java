package app;

import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma temperatura em Celsius e eu irei converter para as temperaturas: Kelvin, Réaumur, Rankine e Fahrenheit (F): ");
        double c = entrada.nextDouble();
        double k =  c + 273.15;
        double f = c * 1.8 + 32;
        double re = c * 0.8;
        double ra = c * 1.8 + 32 + 459.67;

        System.out.println("Convertendo ...");
        try {Thread.sleep(2000);} catch (Exception erro){}

        System.out.printf("A temperatura em Fahrenheit é %.2f",f);
        System.out.printf("\nA temperatura em Réaumur é %.2f ",re);
        System.out.printf("\nA temperatura em Rankine é %.2f",ra);
        System.out.printf("\nA temperatura em Kelvin é %.2f ",k);
    }
}
