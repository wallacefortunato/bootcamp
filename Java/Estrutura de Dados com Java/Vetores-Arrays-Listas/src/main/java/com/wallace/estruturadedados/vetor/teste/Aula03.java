package com.wallace.estruturadedados.vetor.teste;

import com.wallace.estruturadedados.vetor.VetorString;

public class Aula03 {
    public static void main(String[] args) {
        VetorString vetorString = new VetorString(2);

        try {
            vetorString.adicionaElemento("Elemento 1");
            vetorString.adicionaElemento("Elemento 2");
            vetorString.adicionaElemento("Elemento 3");
            vetorString.adicionaElemento("Elemento 4");
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
