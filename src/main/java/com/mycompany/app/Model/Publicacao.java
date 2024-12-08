package com.mycompany.app.Model;

public abstract class Publicacao {
    private String titulo;
    private Autor autor;

    public Publicacao(String titulo, Autor autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public Autor getAutor(){
        return this.autor;
    }

    public void validarPublicacao(){
        
    }
}
