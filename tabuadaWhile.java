public class tabuadaWhile {
    public static void main(String[] args) {

        int cont = 0, multiplicador =0 ;


        while (cont < 10){
            cont++;
            System.out.printf("Tabuadado %d\n",cont);
            while (multiplicador <= 10){
                int x = cont *multiplicador;
                System.out.printf("%d X %d = %d\n",cont, multiplicador, x);
                multiplicador ++;
            }
            multiplicador = 0;
            System.out.println("**********************");

        }
    }
}
