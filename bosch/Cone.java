package bosch;

public class Cone {
    double altura;
    double raio;
    double pi = 3.14;
    double geratriz = 0;
    Cone(double altura, double raio, double geratriz){
        this.altura = altura;
        this.raio = raio;
        this.geratriz = geratriz;
    }
    double volume(){
        return (pi*Math.pow(raio, 2)*altura)/3;
    }
    double AreaS(){
        geratriz = Math.pow(raio, 2)+(Math.pow(altura, 2));
        geratriz = Math.sqrt(geratriz);
        System.out.println(raio);
        System.out.println(raio+geratriz);
        return pi*raio*(raio+geratriz);
    }
}
