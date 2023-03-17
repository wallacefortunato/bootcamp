package com.wallace.estruturadedados.vetor.teste;

import com.wallace.estruturadedados.vetor.Vetor;

public class Aula07 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adicionaElemento("B");
        vetor.adicionaElemento("C");
        vetor.adicionaElemento("D");
        vetor.adicionaElemento("F");
        vetor.adicionaElemento("H");


        System.out.println(vetor);

        vetor.adicionaElemento(0, "A");

        System.out.println(vetor);

        vetor.adicionaElemento(4, "E");

        System.out.println(vetor);

        vetor.adicionaElemento(6, "G");

        System.out.println(vetor);

        String elemento = "F";

        System.out.println("O elemento '" + elemento + "' está na posição " + vetor.buscaElemento(elemento));

        System.out.println("O tamanho atual do vetor é: " + vetor.getTamanho());
    }
}
