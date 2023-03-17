package com.wallace.estruturadedados.vetor.teste;

import com.wallace.estruturadedados.vetor.VetorObject;

public class Aula10 {
    public static void main(String[] args) {
        VetorObject vetor = new VetorObject(1);
        System.out.println("O vetor inicial foi configurado com " + vetor.getNumPosicoesAlocadas() + " posicoes e possui " + vetor.getTamanho() + " elementos preenchidos atualmente.");


        vetor.adicionaElemento(1);
        vetor.adicionaElemento("A");
        vetor.adicionaElemento(0.9);
        vetor.adicionaElemento(false);
        System.out.println("Vetor original:");
        System.out.println(vetor);
        System.out.println(retornaFrase(vetor));

        //Retirando um elemento dada uma posicao
        int posicao = 2;
        System.out.println("Removendo elemento da posicao " + posicao + "...");
        vetor.removeElemento(posicao);
        System.out.println(retornaFrase(vetor));
        System.out.println("Vetor atual:");
        System.out.println(vetor);

        //Retirando um elemento passando o elemento como parametro
        String elemento = "A";
        System.out.println("Removendo elemento " + elemento);
        vetor.removeElemento(elemento);
        System.out.println(retornaFrase(vetor));
        System.out.println("Vetor atual:");
        System.out.println(vetor);

        System.out.println("");
        System.out.println("O vetor final possui " + vetor.getNumPosicoesAlocadas() + " posicoes e  " + vetor.getTamanho() + " elementos não nulos");

    }

    private static String retornaFrase(VetorObject vetor){
        String frase;
        return frase = "O vetor atual possui " + vetor.getNumPosicoesAlocadas() + " posicoes e atualmente possui  " + vetor.getTamanho() + " elementos não nulos";
    }
}
