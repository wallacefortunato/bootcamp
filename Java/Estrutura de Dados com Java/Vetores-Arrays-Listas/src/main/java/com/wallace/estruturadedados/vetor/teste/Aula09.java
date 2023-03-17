package com.wallace.estruturadedados.vetor.teste;

import com.wallace.estruturadedados.vetor.Vetor;

public class Aula09 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(1);
        System.out.println("O vetor inicial foi configurado com " + vetor.getNumPosicoesAlocadas() + " posicoes e possui " + vetor.getTamanho() + " elementos preenchidos atualmente.");

        vetor.adicionaElemento("A");
        vetor.adicionaElemento("B");
        vetor.adicionaElemento("C");
        vetor.adicionaElemento("D");
        vetor.adicionaElemento("E");
        System.out.println("Vetor original:");
        System.out.println(vetor);
        System.out.println(retornaFrase(vetor));

        //Retirando um elemento dada uma posicao
        int posicao = 1;
        System.out.println("Removendo elemento da posicao " + posicao + "...");
        vetor.removeElemento(posicao);
        System.out.println(retornaFrase(vetor));
        System.out.println("Vetor atual:");
        System.out.println(vetor);

        //Retirando um elemento passando o elemento como parametro
        String elemento = "D";
        System.out.println("Removendo elemento " + elemento);
        vetor.removeElemento(elemento);
        System.out.println(retornaFrase(vetor));
        System.out.println("Vetor atual:");
        System.out.println(vetor);

        System.out.println("");
        System.out.println("O vetor final possui " + vetor.getNumPosicoesAlocadas() + " posicoes e  " + vetor.getTamanho() + " elementos não nulos");


    }

    private static String retornaFrase(Vetor vetor){
        String frase;
        return frase = "O vetor atual possui " + vetor.getNumPosicoesAlocadas() + " posicoes e atualmente possui  " + vetor.getTamanho() + " elementos não nulos";
    }
}
