package bosch;

import java.util.Scanner;

public class Menus {
    int opcaoFigura;
    Scanner entrada = new Scanner(System.in);

    void menuPrincipal() {
        while (true) {
            try {
                System.out.println("\n---------- MENU PRINCIPAL ----------");
                System.out.println(
                        " [1] Planas" +
                        "\n [2] Espaciais");
                System.out.print("Digite a opção desejada: ");
                opcaoFigura = entrada.nextInt();
                if (opcaoFigura == 1) {
                    menuPlana();
                } else if (opcaoFigura == 2) {
                    menuEspaciais();
                } else {
                    System.out.println("Digite uma opção válida.");
                    continue;
                }
            }catch (Exception e){
                System.out.println("Digite uma opção válida.");
                entrada.nextLine();
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
                int opcaoPlana = entrada.nextInt();

                if (opcaoPlana == 1) {
                    System.out.println("\n--------- QUADRADO ---------");
                    System.out.print("Digite o lado do quadrado: ");
                    double ladoQuadrado = Tratamento.tratamento();
                    Quadrado q1 = new Quadrado(ladoQuadrado);
                    System.out.printf("\nA área do seu quadrado é %.2f\n", q1.calcularArea());
                    System.out.printf("O perímetro do seu quadrado é %.2f\n", q1.calcularPerimetro());
                }
                else if (opcaoPlana == 2) {
                    System.out.println("\n--------- CIRCULO ---------");
                    System.out.print("Digite o raio do circulo: ");
                    double raioCirculo = Tratamento.tratamento();
                    Circulo c1 = new Circulo(raioCirculo);
                    System.out.printf("\nA área do seu circulo é %.2f\n", c1.areaCirculo());
                    System.out.printf("O perímetro do seu circulo é %.2f\n", c1.perimetroCirculo());
                }
                else if (opcaoPlana == 3){
                    System.out.println("\n--------- TRIÂNGULO ISÓSC. ---------");
                    System.out.print("Digite a base do seu triângulo: ");
                    double base = Tratamento.tratamento();
                    System.out.print("Digite a altura do seu triângulo: ");
                    double altura = Tratamento.tratamento();
                    System.out.print("Digite o lado do seu triângulo: ");
                    double lado = Tratamento.tratamento();
                    Triangulo t1 = new Triangulo(base, altura, lado);
                    System.out.printf("\nA área do seu triângulo é %.2f\n", t1.areaTriangulo());
                    System.out.printf("O perímetro do seu triângulo é %.2f\n", t1.perimetroTriangulo());
                }
                else if (opcaoPlana == 4) {
                    System.out.println("\n--------- RETÂNGULO ---------");
                    System.out.print("Digite a base do retângulo: ");
                    double baseRetangulo = Tratamento.tratamento();
                    System.out.print("Digite a altura do retângulo: ");
                    double alturaRetangulo = Tratamento.tratamento();
                    Retangulo r1 = new Retangulo(baseRetangulo, alturaRetangulo);
                    System.out.printf("\nA área do seu circulo é %.2f\n", r1.areaRetangulo());
                    System.out.printf("O perímetro do seu circulo é %.2f\n", r1.perimetroRetangulo());
                }
                else if (opcaoPlana == 5){
                    System.out.println("\n--------- Hexágono Regular ---------");
                    System.out.print("Digite o lado do hexágono: ");
                    double lado = Tratamento.tratamento();
                    Hexagono h1 = new Hexagono(lado);
                    System.out.printf("\nA área do seu Hexágono é %.2f\n", h1.areaHexagono());
                    System.out.printf("O perímetro do seu hexágono é %.2f\n", h1.perimetroHexagono());
                }
                else {
                    System.out.println("Digite uma opção valida.");
                    continue;
                }
            }catch (Exception e){
                System.out.println("Digite uma opção válida.");
                entrada.nextLine();
                continue;
            }break;
        }menuSairFicar();
    }
    void menuEspaciais(){
        while (true) {
            try {
                System.out.println("\n--------------------------------");
                System.out.println(
                        "\n [1] Cubo" +
                        "\n [2] Paralelepípedo" +
                        "\n [3] Pirâmide de base quadrada" +
                        "\n [4] Esfera" +
                        "\n [5] Cilindro" +
                        "\n [6] Cone");
                System.out.print("Escolha uma das opções acima: ");
                int opcaoEspaciais = entrada.nextInt();
                if (opcaoEspaciais == 1){
                    System.out.println("\n--------- Cubo ---------");
                    System.out.print("Digite o lado do seu cubo: ");
                    double lado = Tratamento.tratamento();
                    System.out.print("Digite a aresta do seu cubo: ");
                    double aresta = Tratamento.tratamento();
                    Cubo c1 = new Cubo(lado, aresta);
                    System.out.printf("\nA área superficial do seu cubo é %.2f\n", c1.calcularAreaS());
                    System.out.printf("O volume do seu cubo é %.2f\n", c1.calcularVol());
                }
                else if (opcaoEspaciais == 2){
                    System.out.println("\n--------- Parelepípedo ---------");
                    System.out.print("Digite o comprimento do seu parelepípedo: ");
                    double comprimento = Tratamento.tratamento();
                    System.out.print("Digite a largura do seu parelepípedo: ");
                    double largura = Tratamento.tratamento();
                    System.out.print("Digite a altura do seu parelepípedo: ");
                    double altura = Tratamento.tratamento();
                    Paralelepipedo p1 = new Paralelepipedo(altura, largura, comprimento);
                    System.out.printf("\nA área superficial do seu parelepípedo é %.2f\n", p1.areaSup());
                    System.out.printf("O volume do seu parelepípedo é %.2f\n", p1.volumr());

                }
                else if (opcaoEspaciais == 3){
                    System.out.println("\n--------- Pirâmide de base quadrada ---------");
                    System.out.print("Digite o comprimento da sua pirâmide: ");
                    double comprimento = Tratamento.tratamento();
                    System.out.print("Digite a altura da sua pirâmide: ");
                    double altura = Tratamento.tratamento();
                    System.out.print("Digite o lado do quadrado da sua pirâmide: ");
                    double lado = Tratamento.tratamento();
                    Piramide p2 = new Piramide(lado, altura, comprimento);
                    System.out.printf("\nA área superficial da sua pirâmide é %.2f\n", p2.calcularArea());
                    System.out.printf("O volume da da sua pirâmide é %.2f\n", p2.volume());
                }
               else if (opcaoEspaciais == 4){
                    System.out.println("\n--------- Esfera ---------");
                    System.out.print("Digite o raio da sua esfera: ");
                    double raio = Tratamento.tratamento();
                    Esfera e1 = new Esfera(raio);
                    System.out.printf("\nA área superficial da sua esfera é %.2f\n", e1.areaS());
                    System.out.printf("O volume da sua esfera é %.2f\n", e1.volume());
                }
                else if (opcaoEspaciais == 5){
                    System.out.println("\n--------- Cilindro ---------");
                    System.out.print("Digite o raio do circulo de seu cilindro: ");
                    double raio = Tratamento.tratamento();
                    System.out.print("Digite a altura de seu cilindro: ");
                    double altura = Tratamento.tratamento();
                    Cilindro c2 = new Cilindro(raio, altura);
                    System.out.printf("\nA área superficial de seu cilindro é %.2f\n", c2.areaS());
                    System.out.printf("O volume de seu cilindro é %.2f\n", c2.volume());
                }
                else if (opcaoEspaciais == 6){
                    System.out.println("\n--------- Cone ---------");
                    System.out.print("Digite o raio do seu cone: ");
                    double raio = Tratamento.tratamento();
                    System.out.print("Digite a altura do seu cone: ");
                    double altura = Tratamento.tratamento();
                    Cone c3 = new Cone(altura,raio,0);
                    System.out.printf("\nA área superficial de seu cilindro é %.2f\n", c3.AreaS());
                   System.out.printf("O volume de seu cilindro é %.2f\n", c3.volume());

                }
                else {
                    System.out.println("Digite uma opção valida.");
                    continue;
                }

            }catch (Exception e){
                System.out.println("Digite uma opção válida.");
                entrada.nextLine();
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
                int decisao = entrada.nextInt();

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
                entrada.nextLine();
                continue;
            }break;
        }
    }

}

