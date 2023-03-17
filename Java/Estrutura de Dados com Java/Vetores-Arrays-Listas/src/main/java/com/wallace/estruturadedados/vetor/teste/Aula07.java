package com.wallace.estruturadedados.vetor.teste;

import com.wallace.estruturadedados.vetor.VetorString;

public class Aula07 {
    public static void main(String[] args) {
        VetorString vetorString = new VetorString(10);

        vetorString.adicionaElemento("B");
        vetorString.adicionaElemento("C");
        vetorString.adicionaElemento("D");
        vetorString.adicionaElemento("F");
        vetorString.adicionaElemento("H");


        System.out.println(vetorString);

        vetorString.adicionaElemento(0, "A");

        System.out.println(vetorString);

        vetorString.adicionaElemento(4, "E");

        System.out.println(vetorString);

        vetorString.adicionaElemento(6, "G");

        System.out.println(vetorString);

        String elemento = "F";

        System.out.println("O elemento '" + elemento + "' está na posição " + vetorString.buscaElemento(elemento));

        System.out.println("O tamanho atual do vetorString é: " + vetorString.getTamanho());
    }
}
