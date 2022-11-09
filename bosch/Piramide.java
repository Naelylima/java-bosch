package bosch;

public class Piramide {
    double lado;
    double altura;
    double areaB;
    double comprimento;
//    double areaB = Math.pow(lado, 2);

    Piramide(double lado, double altura, double comprimento){
        this.lado= lado;
        this.altura = altura;
        this. comprimento = comprimento;
    }
    double calcularArea(){
        return Math.pow(comprimento, 2) + 4*(comprimento*altura/2);
    }
    double volume(){
        return(Math.pow(lado, 2) *altura)/3;
    }
}
