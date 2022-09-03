package app;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor,digite seu salario: ");
        int f1 = entrada.nextInt();
        System.out.println("Por favor,digite seu salario: ");
        int f2 = entrada.nextInt();
        System.out.println("Por favor,digite seu salario: ");
        int f3 = entrada.nextInt();
        System.out.println("Por favor,digite seu salario: ");
        int f4 = entrada.nextInt();

        int media = f1 + f2 + f3 + f4/4;
        System.out.print("A média salria é: "+ media);

    }
}
