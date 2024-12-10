package com.mycompany.app.Model;
import java.util.ArrayList;

import com.mycompany.app.Interface.EstrategiaPublicacao;

public class Autor extends Pessoa implements EstrategiaPublicacao{
  private String nacionalidade;
  private boolean isUser;

  public void publicar(){
    System.out.println("publicando como autor");
  }

  //constructor
  public Autor(String nome, String nacionalidade, boolean isUser){
    super(nome);
    this.nacionalidade = nacionalidade;
    this.isUser = isUser;
  }
  
  //getters
  public String getNome(){
    return super.getNome();
  }

  public boolean getIsUser(){
    return this.isUser;
  }
  
  public ArrayList<Livro> getObrasPublicadas(){
    return super.getLivros();
  }
  
  public ArrayList<Livro> getObrasPublicadasPorGenero(String genero){
    ArrayList<Livro> livrosPorGenero = new ArrayList<>();
    
    ArrayList<Livro> obras = super.getLivros();
    
    for (Livro livro : obras) {
      if (livro.getGenero().equalsIgnoreCase(genero)) {
        livrosPorGenero.add(livro);
      }
    }
    
    return livrosPorGenero;
  }

  public String getNacionalidade(){
    return this.nacionalidade;
  }

  //setters
  public void setIsUser(boolean isUser){
    this.isUser = isUser;
  }

  public void setMaxObras(int quantidade){
    super.setQuantidadeMaxLivros(quantidade);
  }

  public void setLivros(ArrayList<Livro> livros){
    super.setLivros(livros);
  }
}
