package bosch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------- Olá vamos verificar se seu número é primo! ---------");
        Primo primo = new Primo();
        Scanner entrada = new Scanner(System.in);

        System.out.print("\nDigite algum número para verificar se ele é primo: ");
        int numero = entrada.nextInt();
        if (primo.verificacao(numero)) {
            System.out.println("Esse número é primo");
        }
        else {
            System.out.println("Esse número não é primo");
        }
        PrimoAntecessor primoAnt = new PrimoAntecessor();
        primoAnt.PrimosAnt(numero);

    }
}