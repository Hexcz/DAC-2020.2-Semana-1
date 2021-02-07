package br.edu.ifpb;

import java.util.Locale;

public class Pessoa {

    private String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void alterarNome() {
        this.nome = this.nome.toUpperCase();
    }
}
