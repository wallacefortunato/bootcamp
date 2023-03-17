package com.wallace.estruturadedados.vetor.teste;

import com.wallace.estruturadedados.vetor.VetorString;

public class Aula08 {
    public static void main(String[] args) throws Exception {

        VetorString vetorString = new VetorString(3);

        vetorString.adicionaElemento("B");
        vetorString.adicionaElemento("C");
        vetorString.adicionaElemento("D");
        vetorString.adicionaElemento("F");
        vetorString.adicionaElemento("H");

        System.out.println(vetorString);
    }
}
