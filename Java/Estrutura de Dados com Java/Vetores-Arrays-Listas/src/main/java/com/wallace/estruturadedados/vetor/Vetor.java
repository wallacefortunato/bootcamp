package com.wallace.estruturadedados.vetor;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    //Construtor
    public Vetor (int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
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

    //Método para adicionar um novo elemento ao final da última posição do vetor.
    public boolean adicionaElementoUltimaPosicao (String element) throws Exception {
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = element;
            this.tamanho++;
            return true;
        } else {
            throw new Exception("Vetor está cheio, não é possível adicionar um novo elemento.");
        }
    }

    public int getTamanho(){
        return this.tamanho;
    }
}
