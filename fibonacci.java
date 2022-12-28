package bosch;
import java.util.ArrayList;
import java.util.Collections;

public class fibonacci {

    public static void main(String[] args) {
        ArrayList <Integer> listFibonacci = new ArrayList<>();
        listFibonacci.add(0);
        listFibonacci.add(1);

        for (int i=0 ; i< 18; i++){
            Collections.reverse(listFibonacci);

            int num1 = listFibonacci.get(0);
            int num2 = listFibonacci.get(1);

            Collections.reverse(listFibonacci);
            listFibonacci.add(num1 + num2);
        }
        System.out.println(listFibonacci);

    }
}
//
//
