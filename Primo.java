package bosch;

import java.util.Scanner;

public class Primo {
    void verificacao(int numero) {
        int cont = 0;
        if (numero == 2){
            System.out.println("Seu número é primo.");
        }
        else {

            for (int inicio = 1; inicio < numero + 1; inicio++) {
            if (numero % inicio == 0) {
                cont++;
            }
            if (cont == 2) {
                System.out.println("Seu número é primo.");
            } else {
                System.out.println("Seu número não é primo");
            }
            }

        }

    }
}


