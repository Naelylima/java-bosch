public class exercicoRepeticaoTabuada {
    public static void main(String[] args) {

    for (int i = 1; i <=10; i++){
        System.out.printf("Tabuada do %d\n",i);
        for (int j= 0; j <= 10; j++ ){
            int x = i*j;
            System.out.printf("%d X %d = %d\n",i, j, x);
        }
        System.out.println("****************************");

    }

    }
}
