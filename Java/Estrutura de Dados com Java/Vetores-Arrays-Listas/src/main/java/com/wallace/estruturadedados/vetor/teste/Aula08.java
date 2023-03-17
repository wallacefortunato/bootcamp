package com.wallace.estruturadedados.vetor.teste;

import com.wallace.estruturadedados.vetor.Vetor;

public class Aula08 {
    public static void main(String[] args) throws Exception {

        Vetor vetor = new Vetor(3);

        vetor.adicionaElemento("B");
        vetor.adicionaElemento("C");
        vetor.adicionaElemento("D");
        vetor.adicionaElemento("F");
        vetor.adicionaElemento("H");

        System.out.println(vetor);
    }
}
