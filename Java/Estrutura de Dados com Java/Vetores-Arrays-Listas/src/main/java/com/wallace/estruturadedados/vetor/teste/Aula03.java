package com.wallace.estruturadedados.vetor.teste;

import com.wallace.estruturadedados.vetor.Vetor;

public class Aula03 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(2);

        try {
            vetor.adicionaElementoUltimaPosicao("Elemento 1");
            vetor.adicionaElementoUltimaPosicao("Elemento 2");
            vetor.adicionaElementoUltimaPosicao("Elemento 3");
            vetor.adicionaElementoUltimaPosicao("Elemento 4");
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
