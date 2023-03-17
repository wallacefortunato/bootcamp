package com.wallace.estruturadedados.vetor.teste;

import com.wallace.estruturadedados.vetor.VetorString;

public class Aula09 {
    public static void main(String[] args) {
        VetorString vetorString = new VetorString(1);
        System.out.println("O vetor inicial foi configurado com " + vetorString.getNumPosicoesAlocadas() + " posicoes e possui " + vetorString.getTamanho() + " elementos preenchidos atualmente.");

        vetorString.adicionaElemento("A");
        vetorString.adicionaElemento("B");
        vetorString.adicionaElemento("C");
        vetorString.adicionaElemento("D");
        vetorString.adicionaElemento("E");
        System.out.println("Vetor original:");
        System.out.println(vetorString);
        System.out.println(retornaFrase(vetorString));

        //Retirando um elemento dada uma posicao
        int posicao = 1;
        System.out.println("Removendo elemento da posicao " + posicao + "...");
        vetorString.removeElemento(posicao);
        System.out.println(retornaFrase(vetorString));
        System.out.println("Vetor atual:");
        System.out.println(vetorString);

        //Retirando um elemento passando o elemento como parametro
        String elemento = "D";
        System.out.println("Removendo elemento " + elemento);
        vetorString.removeElemento(elemento);
        System.out.println(retornaFrase(vetorString));
        System.out.println("Vetor atual:");
        System.out.println(vetorString);

        System.out.println("");
        System.out.println("O vetor final possui " + vetorString.getNumPosicoesAlocadas() + " posicoes e  " + vetorString.getTamanho() + " elementos não nulos");


    }

    private static String retornaFrase(VetorString vetorString){
        String frase;
        return frase = "O vetor atual possui " + vetorString.getNumPosicoesAlocadas() + " posicoes e atualmente possui  " + vetorString.getTamanho() + " elementos não nulos";
    }
}
