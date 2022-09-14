package Bosch;

public class ConversapStringInt {
    public static void main(String[] args) {

        //  Wrapper conersão de string para numero

        String numero1 = "12";
        String numero2 = "3.14";


        int x = Integer.parseInt(numero1);

        double y = Double.parseDouble(numero2);

        double soma = x+y;

        System.out.println(soma);
    }
}
