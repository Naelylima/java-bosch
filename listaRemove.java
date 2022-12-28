package bosch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class listaRemove {

    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>(Arrays.asList("Adhayne", "Beatriz", "emilly", "Batista", "Tejero", "Tayssa", "Rayssa", "Grazielly", "Luiza", "Maicon", "Alex", "Macharete","Capovila", "Gustavo", "Livia", "Radija", "Guilherme", "Naely"));

        Random aleatorio = new Random();

        for (int i=0 ; i < 9 ; i++){
            int aux = aleatorio.nextInt(alunos.size());
            alunos.remove(aux);
        }
        System.out.println(alunos);

    }
}
