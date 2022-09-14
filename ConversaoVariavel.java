package Bosch;

public class ConversaoVariavel {
    public static void main(String[] args) {

        // Trocar de tipo de variavel
        double a = 1;
        System.out.println(a);

//  conersão explicita pelo tamnho de double ser maior que a de float, mostra ciência da informação
        float b = (float) a;
        System.out.println(b);
    }
}
