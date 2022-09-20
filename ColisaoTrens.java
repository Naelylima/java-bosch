import java.util.Scanner;

public class ColisaoTrens {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int posA, posB, velocidadeA, velocidadeB ;
        System.out.println("Considere que as extremidades da ferrovia vão do KM 0 até o KM 10.000");
        System.out.println("Digite a posição inicial do trem A (km): ");
        posA= entrada.nextInt();
        System.out.println("Digite a posição do Trem B: ");
        posB = entrada.nextInt();
        System.out.println("Digite a velociddae do trem A (max 300km): ");
        velocidadeA = entrada.nextInt();
        System.out.println("Digite a velocidade do trem B (max 300km): ");
    }
}

