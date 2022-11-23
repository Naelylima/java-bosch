package bosch;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class PrimoAntecessor {
    ArrayList<Integer> listaPrimos = new ArrayList<>();
    ArrayList<Integer> listaNum = new ArrayList<>();
    Primo primo = new Primo();

    void PrimosAnt(int numero){
        for (int i = 1; i< numero+1; i++ ){
            if (primo.verificacao(i)){
                listaPrimos.add(i);
            }
            else {
                listaNum.add(i);
            }
        }
        System.out.println("Lista de números primos: "+listaPrimos);
        System.out.println("Lista de números não primos: "+listaNum);
    }
}
