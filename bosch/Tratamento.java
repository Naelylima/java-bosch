package bosch;

import java.util.Scanner;

public class Tratamento {
    static double tratamento() {
        Scanner x = new Scanner(System.in);
        String a;
        while (true) {
            try {
                a = x.nextLine();
                if (a.equals("")){
                    System.out.print("Digite uma opção válida: ");
                    continue;
                }
                if (Double.parseDouble(a) <= 0) {
                    System.out.print("Digite um número maior que '0': ");;
                    x.nextLine();
                    continue;
                }
                return Double.parseDouble(a);
            } catch (Exception e) {
                System.out.print("Você digitou algo errado, digite novamente: ");
            }
        }
    }
}
