package Bosch;

public class ExercicioPrecedencia {
    public static void main(String[] args) {
        double nota = 4.1;
        int presença = 30;
        boolean postura = false;
        String situacao ;

        if(nota>= 5.0 && presença>=75 && postura == true){
            situacao = "Aprovado";
        }
        else if (nota <5.0 && presença >= 75 && postura == true){
            situacao = "Recuperação de provas";
        }
        else if (nota>=5.0 && presença <75 && postura == true){
            situacao= "Sem ferias";
        }
        else  if (nota>=5.0 && presença >=75 && !postura){
            situacao="Chamar para conversar";
        }
        else {
            situacao= "Reprovado";
        }
        System.out.println(situacao);
    }
}
