package com.wallace.estruturadedados.vetor.teste;

import com.wallace.estruturadedados.vetor.VetorString;

public class Aula06 {
    public static void main(String[] args) throws Exception {
        VetorString vetorString = new VetorString(10);

        vetorString.adicionaElemento("Elemento 1");
        vetorString.adicionaElemento("Elemento 2");
        vetorString.adicionaElemento("Elemento 3");

        System.out.println(vetorString.buscaElemento("Elemento 2"));
    }
}
