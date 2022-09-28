package Bosch;

import java.util.Scanner;

public class colisaoTrens {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double posA=0, posB=0, velocidadeA=0, velocidadeB=0;
        System.out.println("Considere que as extremidades da ferrovia vão do KM 0 até o KM 10.000");

        while (true) {

            while (true) {
                try {
                    System.out.print("\nDigite a posição inicial do trem A (km 0/ 10.000): ");
                    posA = entrada.nextInt();
                    if (posA < 0 || posA > 10000) {
                        System.out.println("\nO número deve ser maior ou igual a zero e\n" +
                                "menor que 10000.");
                        continue;

                }
                }
                catch (Exception i){
                    System.out.println("Você digitou algo errado");
                    entrada.nextLine();
                    continue;
                }

                break;
            }
            while (true){
                try {
                    System.out.print("Digite a posição do Trem B (km 0/ -10.00): ");
                    posB = entrada.nextInt();
                    if (posB < 0 || posB > 10000) {
                        System.out.println("O número deve ser maior ou igual a zero e\n" +
                                "menor que 10000.");
                        continue;
                    }
                }
                catch (Exception i){
                    System.out.println("Você digitou algo errado");
                    entrada.nextLine();
                    continue;
                }
                break;
            }
            while (true){
                try {
                    System.out.print("\nDigite a velociddae do trem A (max 300km): ");
                    velocidadeA = entrada.nextInt();
                    if (velocidadeA > 300 || velocidadeA <0){
                        System.out.println("A velocidade do trem A sempre será positiva.\n" +
                                "Por favor, digite novamente:");
                        continue;
                    }
                }
                catch (Exception i){
                    System.out.println("Você digitou algo errado");
                    entrada.nextLine();
                    continue;
                }
                break;

            }
        while (true){
            try {
                System.out.print("Digite a velocidade do trem B (max 300km): ");
                velocidadeB = entrada.nextInt();
                if (velocidadeB >0 ||velocidadeB < (-300) ){
                    System.out.println("\nA velocidade do trem B sempre será " +
                            "negativa.\n" +
                            "Por favor, digite novamente");
                    continue;
                }
            }
            catch (Exception i){
                System.out.println("Você digitou algo errado");
                entrada.nextLine();
                continue;
            }
            break;

        }
            double tempo = (posA - posB) / (velocidadeB - velocidadeA);
            double posicaoFinal = posA + (velocidadeA*tempo);
            System.out.printf("\nA colisão dos trens acontecerá no KM %.2f e\n" +
                    "ocorrerá após %.0f segundos",posicaoFinal, tempo*3600);


            try {
                System.out.println("\n\nVocê deseja exxecutar novamente? Se sim aperte 1, se não digite qualquer outro caractere.");
                int resposta = entrada.nextInt();
                if (resposta == 1){
                    continue;
                }
                else {
                    System.out.println("Até a proxima :)");
                    break;
                }

            }
            catch (Exception e){
                System.out.println("Digite uma opção valida");
            }


        }
    }
}
