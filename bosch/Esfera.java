package bosch;

public class Esfera {
    double pi = 3.14;
    double raio;
    Esfera( double raio){
        this.raio = raio;
    }
    double areaS(){
        return  4*pi*(Math.pow(raio, 2));

    }
    double volume(){
        return (4*pi*(Math.pow(raio, 3)))/3;
    }


}
