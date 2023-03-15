package com.wallace.estruturadedados.vetor.teste;

import com.wallace.estruturadedados.vetor.Vetor;

public class Aula06 {
    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(10);

        vetor.adicionaElementoUltimaPosicao("Elemento 1");
        vetor.adicionaElementoUltimaPosicao("Elemento 2");
        vetor.adicionaElementoUltimaPosicao("Elemento 3");

        System.out.println(vetor.buscaElemento("Elemento 2"));
    }
}
