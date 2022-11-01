package bosch;

public class Quadrado {
    double lado;
    Quadrado(double lado){
        this.lado = lado;
    }
    //    sem parâmetro, já passou ele na classe
    //    deixar todos os print no main para consegui manusear eles

    double calcularArea(){
        return Math.pow(this.lado, 2);
    }
    double calcularPerimetro(){
        return this.lado*4;
    }
}
