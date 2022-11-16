import java.util.Arrays;

public class listaVazia {
    public static void main(String[] args) {
//     toda array vazia em java precisa ser inicializada com um tamanho.
       int[] meuArray = new int[5];
        System.out.println(Arrays.toString(meuArray));
        meuArray[0]= 1;
        meuArray[1]= 2;
        meuArray[2]= 3;
        meuArray[3]= 4;
        meuArray[4]= 5;
        System.out.println(Arrays.toString(meuArray));
//        Fill = preenche todas posições da lista.
        Arrays.fill(meuArray, 1);
        System.out.println(Arrays.toString(meuArray));

//

    }
}