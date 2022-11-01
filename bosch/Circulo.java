package bosch;

public class Circulo {
    double pi = 3.14;
    double raio;
    Circulo(double raio){
        this.raio = raio;
    }

    double areaCirculo (){
       return pi*(Math.pow(raio, 2));

    }
    double  perimetroCirculo (){
        return 2*pi*raio;
    }
}
