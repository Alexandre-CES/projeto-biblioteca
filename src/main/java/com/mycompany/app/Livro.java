package com.mycompany.app;

public class Livro{
    private String titulo;
    private Autor autor;
    private String genero;
    private boolean isDisponivel;

    //constructor
    public Livro(String titulo, Autor autor, String genero){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.isDisponivel = true;
    }

    //getters
    public String getTitulo(){
        return this.titulo;
    }

    public Autor getAutor(){
        return this.autor;
    }

    public String getGenero(){
        return this.genero;
    }
    
    //setters
    public void setIsDisponivel(boolean isDisponivel){
      this.isDisponivel = isDisponivel;
    }
    
    //checar se é disponível
    public Boolean isDisponivel(){
        if(this.isDisponivel){
          return true;
        }else{
          return false;
        }
    } 

    //função sem retorno
    public void validarDisponibilidade(){
        if(this.isDisponivel()){
            System.out.println("the book is avaible");
        }else{
            System.out.println("the book is not avaible");
        }
    }
}
