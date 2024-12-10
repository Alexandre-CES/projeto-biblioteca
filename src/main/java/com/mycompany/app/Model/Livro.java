package com.mycompany.app.Model;

public class Livro extends Publicacao{
    private String genero;
    private boolean isDisponivel;

    //constructor
    public Livro(String titulo, Autor autor, String genero){
        super(titulo,autor);
        this.genero = genero;
        this.isDisponivel = true;
    }

    //getters
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

    @Override
    public void validarPublicacao(){
        System.out.println("Validando publicação de livro...");
    }
}
