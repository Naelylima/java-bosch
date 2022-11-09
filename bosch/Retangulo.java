package bosch;

public class Retangulo {
    double base;
    double altura;

    Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    double areaRetangulo(){
        return base*altura;
    }
    double perimetroRetangulo(){
        return (base*2) + (altura*2);
    }
}
