package bosch;

public class Paralelepipedo {
    double alturaB;
    double larguraC;
    double comprimentoA;
    Paralelepipedo(double alturaB, double larguraC, double comprimentoA){
        this.alturaB = alturaB;
        this.larguraC = larguraC;
        this.comprimentoA = comprimentoA;
    }
    double areaSup(){
        return 2*(larguraC * alturaB + larguraC * comprimentoA + alturaB * comprimentoA);
    }
    double volumr(){
        return alturaB * larguraC * comprimentoA;
    }
}

