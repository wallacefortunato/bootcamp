package com.wallace.estruturadedados.vetor;

import java.lang.reflect.Array;

public class VetorGeneric<T> {

    private T[] elementos;
    private int tamanho;

    //Construtor para array do tipo genérico utilizando reflection
    public VetorGeneric(int capacidade, Class<T> tipoClasse){
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade); //O (T[]) é o casting e o Array.newInstance é o reflection.
        this.tamanho = 0;
    }

    //Construtor mais elegante do tipo genérico
    public VetorGeneric(int capacidade){
        this.elementos = (T[]) new Object[capacidade]; //O (T[]) é o casting.
        this.tamanho = 0;
    }

    //Método para adicionar um novo elemento à primeira posição nula do vetor
    public void adicionaElementoPrimeiraPosicaoNula(T element){
        for (int i = 0; i < this.elementos.length; i++) {
            if(this.elementos[i] == null){
                this.elementos[i] = element;
                this.tamanho++;
                break;
            }
        }
    }

    //Método para adicionar um novo elemento ao final da última posição do vetor (vetor com capacidade dinamica).
    public void adicionaElemento (T element) {
        if (this.tamanho >= this.elementos.length){
            this.dobraCapacidade();
        }

        this.elementos[this.tamanho] = element;
        this.tamanho++;
    }

    //Adiciona um elemento em qualquer posição (vetor com capacidade dinamica).
    public void adicionaElemento (int posicao, T element) throws IllegalArgumentException {
        if (verificaPosicao(posicao)){

            this.dobraCapacidade();

            for (int i = this.tamanho-1; i >= posicao; i--) { //O primeiro item a ser iterado é o último elemento preenchido do array.
                this.elementos[i+1] = this.elementos[i]; //O elemento posterior recebe o elemento atual.
            }
            this.elementos[posicao] = element;
            this.tamanho++;
        } else {
            throw new IllegalArgumentException ("Posição informada é inválida");
        }
    }

    //Remove um elemento dada uma posicao
    public void removeElemento (int posicao) throws IllegalArgumentException {
        if (verificaPosicao(posicao)){
            for (int i = posicao; i < this.tamanho-1; i++) {
                this.elementos[i] = this.elementos[i+1];
            }
            this.elementos[this.tamanho-1] = null;
            this.tamanho--;
        } else {
            throw new IllegalArgumentException ("Posição informada é inválida");
        }
    }

    //Remove um elemento passado como parâmetro
    public void removeElemento (T element) throws IllegalArgumentException {
        int posicao = buscaElemento(element);

        if (posicao == -1){
            throw new IllegalArgumentException("O elemento não existe");
        } else {
            removeElemento(posicao);
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

    //Busca elemento por posição
    public T buscaElemento(int posicao) throws IllegalArgumentException {
        if (!verificaPosicao(posicao)){
            throw new IllegalArgumentException("Posição informada é inválida");
        }
        return this.elementos[posicao];
    }

    //Busca a posição do elemento passado como parâmetro caso exista no array
    public int buscaElemento (T elemento){
        for (int i = 0; i < this.tamanho; i++){
            if (this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    //Retorna o número de posições que o vetor comporta
    public int getNumPosicoesAlocadas(){
        return this.elementos.length;
    }


    //=========================MÉTODOS AUXILIARES=========================


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

    //Aumentando dinamicamente a capacidade de um vetor
    private void dobraCapacidade() {
        if (this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length*2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos [i];
            }
            this.elementos = elementosNovos;
        }
    }

    private boolean verificaPosicao (int posicao){
        if (posicao >= 0 && posicao < getTamanho()){
            return true;
        } else {
            return false;
        }
    }
}
