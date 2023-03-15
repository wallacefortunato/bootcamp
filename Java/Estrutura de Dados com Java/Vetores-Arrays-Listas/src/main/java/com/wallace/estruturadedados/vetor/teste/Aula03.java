package com.wallace.estruturadedados.vetor.teste;

import com.wallace.estruturadedados.vetor.Vetor;

public class Aula03 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(2);

        try {
            vetor.adicionaElemento("Elemento 1");
            vetor.adicionaElemento("Elemento 2");
            vetor.adicionaElemento("Elemento 3");
            vetor.adicionaElemento("Elemento 4");
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
