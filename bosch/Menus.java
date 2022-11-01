package bosch;

import java.util.Scanner;

public class Menus {
    int opcaoFigura;
    Scanner x = new Scanner(System.in);

    void menuPrincipal() {
        while (true) {
            try {
                System.out.println("\n---------- MENU PRINCIPAL ----------");
                System.out.println(
                        " [1] Planas" +
                        "\n [2] Espaciais");
                System.out.print("Digite a opção desejada: ");
                opcaoFigura = x.nextInt();
                if (opcaoFigura == 1) {
                    menuPlana();
                } else if (opcaoFigura == 2) {
                    menuEspaciais();
                } else {
                    System.out.println("Digite uma opção válida.");
                }
            }catch (Exception e){
                System.out.println("Digite uma opção válida.");
                x.nextLine();
                continue;
            }break;
        }
    }

    void menuPlana() {
        while (true) {
            try {
                System.out.println("--------------------------------");
                System.out.println(" [1] Quadrado" +
                        "\n [2] Círculo" +
                        "\n [3] Triângulo" +
                        "\n [4] Retângulo" +
                        "\n [5] Hexágono Regular");
                System.out.print("Escolha uma das opções acima: ");
                int opcaoPlana = x.nextInt();

                if (opcaoPlana == 1) {
                    System.out.println("\n--------- QUADRADO ---------");
                    System.out.print("Digite o lado do quadrado: ");
                    double ladoQuadrado = x.nextDouble();
                    Quadrado q1 = new Quadrado(ladoQuadrado);
                    System.out.printf("\nA área do seu quadrado é %.2f\n", q1.calcularArea());
                    System.out.printf("O perímetro do seu quadrado é %.2f\n", q1.calcularPerimetro());
                }
            }catch (Exception e){
                System.out.println("Digite uma opção válida.");
                x.nextLine();
                continue;
            }break;
        }menuSairFicar();
    }
    void menuEspaciais(){
        while (true) {
            try {
                System.out.println("\n--------------------------------");
                System.out.println(" [1] Quadrado" +
                        "\n [2] Cubo" +
                        "\n [3] Paralelepípedo" +
                        "\n [4] Pirâmide de base quadrada" +
                        "\n [5] Esfera" +
                        "\n [6] Cilindro" +
                        "\n [7] Cone");
                System.out.print("Escolha uma das opções acima: ");
                int opcaoEspaciais = x.nextInt();
            }catch (Exception e){
                System.out.println("Digite uma opção válida.");
                x.nextLine();
                continue;
            }break;
        }menuSairFicar();
    }

    void menuSairFicar(){
        while (true) {
            try {
                System.out.println("\n------------- MENUS -------------");
                System.out.println(" [1] Voltar ao menu principal\n" +
                        " [2] Voltar ao menu de figuras planas\n" +
                        " [3] Voltar ao menu de figuras espaciais\n" +
                        " [4] Sair ");
                System.out.print("Digite a opção desejda: ");
                int decisao = x.nextInt();

                if (decisao == 1) {
                    menuPrincipal();
                } else if (decisao == 2) {
                    menuPlana();
                } else if (decisao == 3) {
                    menuEspaciais();
                }
                 else if (decisao == 4) {
                    System.out.println("\n-------- ATÉ A PROXIMA -------");
                    break;
                 }
                else {
                    System.out.println("Digite uma opção válida");
                    continue;
                }
            }catch (Exception e){
                System.out.println("Digite uma opção válida.");
                x.nextLine();
                continue;
            }break;
        }
    }

}

