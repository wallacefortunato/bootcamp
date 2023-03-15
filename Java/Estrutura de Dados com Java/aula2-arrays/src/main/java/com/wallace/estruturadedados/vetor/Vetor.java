package com.wallace.estruturadedados.vetor;

public class Vetor {

    private String[] elementos;

    //Construtor
    public Vetor (int capacidade){
        this.elementos = new String[capacidade];
    }

    //Método para adicionar um novo elemento à primeira posição nula do vetor
    public void adicionaElementoPrimeiraPosicaoNula(String element){
        for (int i = 0; i < this.elementos.length; i++) {
            if(this.elementos[i] == null){
                this.elementos[i] = element;
                break;
            }
        }
    }
}
