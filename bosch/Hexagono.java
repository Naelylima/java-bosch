package bosch;

public class Hexagono {
    double lado;
    Hexagono(double lado){
        this.lado = lado;

    }
    double areaHexagono(){
        return (3*(Math.sqrt(3))*(Math.pow(lado,2))/2);
    }
    double perimetroHexagono(){
        return lado*6;
    }
}

