package bosch;

public class Cilindro {
    double raio;
    double altura;
    double pi = 3.14;
    Cilindro(double raio, double altura){
        this.raio = raio;
        this.altura = altura;
    }
    double areaS(){
        return 2*(pi*Math.pow(raio, 2)) + (2*pi*raio*altura);
    }
    double volume(){
        return pi*(Math.pow(raio, 2))*altura;
    }
}


