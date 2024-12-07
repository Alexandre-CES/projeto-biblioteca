package com.mycompany.app.Model;
import java.util.ArrayList;
import java.util.List;

public class Usuario extends Pessoa{
  private int idade;
  private List<Emprestimo> historicoEmprestimos = new ArrayList<>();

  //constructor
  public Usuario(String nome, int idade){
    super(nome);
    this.idade = idade;
  }
 
  //getters
  public String getNome(){
    return super.getNome();
  }

  public int getMaxLivrosEmprestados(){
    return super.getQuantidadeMaxLivros();
  }

  public ArrayList<Livro> getLivrosEmprestados(){
    return super.getLivros();
  }

  public int getIdade(){
    return this.idade;
  } 
  
  public List<Emprestimo> getHistoricoEmprestimos(){
    return this.historicoEmprestimos;
  }

  //setters
  public void setMaxLivrosEmprestados(int quantidade){
    super.setQuantidadeMaxLivros(quantidade);
  }

  public void appendHistoricoEmprestimo(Emprestimo emprestimo){
    this.historicoEmprestimos.add(emprestimo);
  }
}
