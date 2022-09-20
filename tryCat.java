import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCat {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        int num ;
//        try {
//        System.out.print("Digite um número: ");
//        num = input.nextInt();
//        System.out.printf("O numero digitado foi %d\n",num);
//        }
//        catch (Exception e){
//            System.out.println("VOCÊ DIGITOU ALGO ERRADO");
//        }
//        finally {
//            System.out.println("é sempre executado");
//        }
//        /////////////////////////////////////////////
        Scanner input = new Scanner(System.in);
        int num ;
        while (true) {
            try {
                System.out.println("Digite um número: ");
                num = input.nextInt();
                if (num < 20) {
                    System.out.print("Só numeros maiores que 20");
                    continue;
                }
                break;

            } catch (InputMismatchException e) {
                System.out.println("Você digitou algo errado");
            }
            input.nextLine();
        }
        System.out.println(num);
    }

}
