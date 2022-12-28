package bosch;

import java.util.ArrayList;
import java.util.Scanner;

public class cpfs {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> cpfLista = new ArrayList<>();
        while (true) {
            System.out.print("Digite os 9 primeiros digitos do seu CPF: ");
            String cpf = entrada.nextLine();
            cpf = cpf.replaceAll("\\.", "");
            if (cpf.length() != 9 ){
                System.out.println("Digite apenas os 9 primeiros números!\n");
            }
            else {
                int num1 = Integer.parseInt(String.valueOf(cpf.charAt(0)));
                int num2 = Integer.parseInt(String.valueOf(cpf.charAt(1)));
                int num3 = Integer.parseInt(String.valueOf(cpf.charAt(2)));
                int num4 = Integer.parseInt(String.valueOf(cpf.charAt(3)));
                int num5 = Integer.parseInt(String.valueOf(cpf.charAt(4)));
                int num6 = Integer.parseInt(String.valueOf(cpf.charAt(5)));
                int num7 = Integer.parseInt(String.valueOf(cpf.charAt(6)));
                int num8 = Integer.parseInt(String.valueOf(cpf.charAt(7)));
                int num9 = Integer.parseInt(String.valueOf(cpf.charAt(8)));
                cpfLista.add(num1);
                cpfLista.add(num2);
                cpfLista.add(num3);
                cpfLista.add(num4);
                cpfLista.add(num5);
                cpfLista.add(num6);
                cpfLista.add(num7);
                cpfLista.add(num8);
                cpfLista.add(num9);
                break;
            }
        }
        int posLista = 0;
        int soma = 0;
        for (int cont = 10; cont >1 ; cont--) {
            int aux = cpfLista.get(posLista)* cont;
            posLista ++;
            soma = soma+aux;
        }
        int D1 = 11 -(soma%11);
        if (D1 > 9){
            D1 = 0;
        }
        cpfLista.add(D1);

        int posLista2 = 0;
        int soma2 = 0;

        for (int cont = 11; cont >1 ; cont--) {
            int aux2 = cpfLista.get(posLista2)* cont;
            posLista2 ++;
            soma2 = soma2+aux2;
        }
        int D2 = 11 -(soma2%11);
        if (D2 > 9){
            D2 =0;
        }
        cpfLista.add(D2);
        String cpfAtual = ""+cpfLista.get(0) + cpfLista.get(1)+ cpfLista.get(2) + "." +cpfLista.get(3) + cpfLista.get(4)+ cpfLista.get(5) +"."+ cpfLista.get(6)+ cpfLista.get(7)+ cpfLista.get(8)+"-"+ cpfLista.get(9)+cpfLista.get(10);
        System.out.println("CPF RECONHECIDO: "+cpfAtual);


    }
}
