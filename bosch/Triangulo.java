package bosch;

public class Triangulo {
    double base;
    double altura;
    double lado;
    Triangulo(double base, double altura, double lado){
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    double areaTriangulo(){
        return (base*altura)/2;
    }
    double perimetroTriangulo(){
        return lado*3;
    }
//    double altura(){
//        double h =Math.sqrt(Math.pow(lado, 2)-(Math.pow(base, 2)/4));
//        return (base*h)/2;
//    }
}
