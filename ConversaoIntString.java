package Bosch;

public class ConversaoIntString {
    public static void main(String[] args) {

        //  Wrapper conversão em numero para string

        Integer num1= 10000;
        System.out.println(num1.toString().length());

        int num2 = 100000;
        System.out.println(Integer.toString(num2).length());

        double pi = 3.14;
        System.out.println(Double.toString(pi).length());
    }
}
