package app;

import java.util.Scanner;

public class Parede {
    public static void main(String[] args) {
        double hp, lp, ha, la, qtd;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a altura da parede: ");
        hp = entrada.nextDouble();
        System.out.println("Digite a largura da parede: ");
        lp = entrada.nextDouble();;
        System.out.println("Digite a altura da do azulejo: ");
        ha = entrada.nextDouble();;
        System.out.println("Digite a largura do azulejo: ");
        la = entrada.nextDouble();;

        qtd = (hp * lp) / (ha * la);

        System.out.println("Quantidade de azulejos necessários para cobrir a parede: " + qtd);
    }
}
