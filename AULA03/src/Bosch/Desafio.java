package Bosch;

public class Desafio {
    public static void main(String[] args) {
        double part1 = -3/4D;
        double part2 = (Math.pow(3, -1))/4;
        double resolucao;

        resolucao= ((3*Math.pow(part1,-2))+((6*part2)-4))/((7*Math.pow((part1), -1))+2);
        double contaFinal = (Math.pow(resolucao,-1))+4;
        System.out.println(contaFinal);

    }
}
