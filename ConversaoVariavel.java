package Bosch;

public class ConversaoVariavel {
    public static void main(String[] args) {

        // Trocar de tipo de variavel


//  conersão explicita pelo tamnho de double ser maior que a de float, mostra ciência da informação
        double a = 1;
        System.out.println(a);

        float b = (float) a;
        System.out.println(b);

        int c = 127;
        byte d = (byte) c;
        System.out.println(d);

        double e = 1.999999;
        int f = (int) e;
        System.out.println(f);
    }
}
