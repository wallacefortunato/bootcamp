package com.wallace.estruturadedados.array;

public class ArrayExemplo {
    public static void main(String[] args) {
        double[] temperaturas = new double[365];

        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;

        System.out.println("O valor da temperatura do dia 3 é: " + temperaturas[2]);

        System.out.println("O tamanho do array é: " + temperaturas.length);

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("O valor da temperatura do dia " + (i+1) + " é: " + temperaturas[i]);
        }

        for (double temp : temperaturas){ //Forma reduzida de iteração em todos os elementos de um array
            System.out.println("O valor da temperatura do dia é: " + temp);
        }
    }
}
