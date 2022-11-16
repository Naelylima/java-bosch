import java.util.ArrayList;

public class arrayL {
    public static void main(String[] args) {
//        O array list não aceita tipos primitivos
        ArrayList<String> nome = new ArrayList<>();
        nome.add("lucas");
        nome.add( "julia");
        nome.add("joana");
//        No array para acessar posição é atraves do get
        System.out.println(nome.get(0));
//        não precisa do toString
        System.out.println(nome);
//        size é o lengueth do arraylista
        System.out.println(nome.size());
//          para remove é usado o remove
        nome.remove(0); // ||  nome.remove("lucas);
        System.out.println(nome);

    }


}
