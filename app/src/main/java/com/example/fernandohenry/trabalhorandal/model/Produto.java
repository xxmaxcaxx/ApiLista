package com.example.fernandohenry.trabalhorandal.model;

/**
 * Created by User on 26/11/2017.
 */

public class Produto {
    private int id;
    private String nome;
    private String anoProduto;
    private int resourceIdImagem;

    public Produto(){

    }

    public Produto(int id, String nome, String anoProduto, int resourceIdImagem){
        this.id = id;
        this.nome = nome;
        this.anoProduto = anoProduto;
        this.resourceIdImagem = resourceIdImagem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getResourceIdImagem() {
        return resourceIdImagem;
    }

    public void setResourceIdImagem(int resourceIdImagem) {
        this.resourceIdImagem = resourceIdImagem;
    }

    public String getAnoProduto() {
        return anoProduto;
    }

    public void setAnoProduto(String anoProduto) {
        this.anoProduto = anoProduto;
    }
}
