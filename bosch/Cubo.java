package bosch;

public class Cubo {
    double lado;
    double aresta;

    Cubo(double lado, double aresta){
        this.lado = lado;
        this.aresta = aresta;
    }
    double calcularAreaS(){
        return lado *6;
    }
    double calcularVol(){
        return Math.pow(aresta, 3);
    }
}
