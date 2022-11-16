public class forEchat {
    public static void main(String[] args) {

        double[] notas ={1,2,3,4,5,6};
        for (double nota: notas){
            System.out.println(nota+1);
        }
        System.out.println(notas[notas.length -1]);

        String[] nome ={"naely"};
//        O método charAt() retorna o caractere especificado a partir de uma string.
        System.out.println(nome[0].charAt(0));
    }
}
