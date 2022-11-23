package bosch;

import java.util.ArrayList;
import java.util.Scanner;
public class Primo {
    boolean verificacao(int numero) {
        int cont = 0;


            for (int inicio = 1; inicio < numero + 1; inicio++) {
                if (numero % inicio == 0) {
                    cont++;
                }


//            if (cont == 2) {
//                System.out.println("*** Seu número é primo. ***");
//                return true;
//            } else {
//                System.out.println("*** Seu número não é primo ***");
//                return false;
//
//            }
        }
        return cont == 2;

    }
}


