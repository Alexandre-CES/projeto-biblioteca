package com.mycompany.app.Model;
import java.util.ArrayList;

public class Pessoa{
  private String nome;
  private ArrayList<Livro> livros;
  private int quantidadeMaxLivros;

  public Pessoa(String nome){
    this.nome = nome;
    this.livros = new ArrayList<>();
  }
  
  //getters
  public String getNome(){
    return this.nome;
  }
  
  public ArrayList<Livro> getLivros(){
    return this.livros;
  }
  
  public int getQuantidadeMaxLivros(){
    return this.quantidadeMaxLivros;
  }

  //setters
  public void setLivros(ArrayList<Livro> livros){
    this.livros = livros;
  }
  
  public void setQuantidadeMaxLivros(int quantidade){
    this.quantidadeMaxLivros = quantidade;
  }

}
