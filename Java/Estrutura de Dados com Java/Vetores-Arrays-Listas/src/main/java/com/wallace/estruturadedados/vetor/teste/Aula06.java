package com.wallace.estruturadedados.vetor.teste;

import com.wallace.estruturadedados.vetor.Vetor;

public class Aula06 {
    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(10);

        vetor.adicionaElemento("Elemento 1");
        vetor.adicionaElemento("Elemento 2");
        vetor.adicionaElemento("Elemento 3");

        System.out.println(vetor.buscaElemento("Elemento 2"));
    }
}
