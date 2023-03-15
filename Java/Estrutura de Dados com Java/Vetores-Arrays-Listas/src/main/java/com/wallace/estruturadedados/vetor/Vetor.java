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
    public void adicionaElementoUltimaPosicao (String element) throws Exception {
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = element;
            this.tamanho++;
        } else {
            throw new Exception("Vetor está cheio, não é possível adicionar um novo elemento.");
        }
    }

    public int getTamanho(){
        return this.tamanho;
    }

    @Override
    public String toString() {

        StringBuilder s = montarString();

        return s.toString();
    }

    //Método auxiliar para montar a visualização do vetor sem a presença de elementos nulos (somente com elementos reais)
    private StringBuilder montarString(){
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho-1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0){
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");

        return s;
    }

    public String buscaElemento(int posicao) throws IllegalArgumentException {
        if (!(posicao >= 0 && posicao < getTamanho())){
            throw new IllegalArgumentException("Posição informada é inválida");
        }

        return this.elementos[posicao];
    }
}
