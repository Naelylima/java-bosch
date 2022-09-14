package Bosch;

public class Precedencia {
    public static void main(String[] args) {

        //       tabela de precedencia
        System.out.println(10+2*20);

        System.out.println(12-9/3);

        System.out.println(10+2==6*2);

        System.out.println(16>8+8);

        int x=3, y=4, z=5;

        System.out.println(x < y && z > y);

        System.out.println(x>z || x<x);

        System.out.println(!(x<y)== x>y);

        System.out.println(!(y<x) && x>z || z<y);

        System.out.println(x == z - y && z != y - x || y !=z - x);
    }
}
