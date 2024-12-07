package com.mycompany.app.Model;
import java.util.ArrayList;

import com.mycompany.app.Interface.Pessoavel;

public class Pessoa implements Pessoavel{
  private String nome;
  private ArrayList<Livro> livros;
  private int quantidadeMaxLivros;

  public Pessoa(String nome){
    this.nome = nome;
    this.livros = new ArrayList<>();
  }
  
  //getters
  @Override
  public String getNome(){
    return this.nome;
  }

  @Override
  public void setnome(String nome){
    this.nome = nome;
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
