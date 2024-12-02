package com.mycompany.app;
import java.util.Date;

public class Emprestimo{
  private Date dataRetirada;
  private Date dataDevolucao;
  private Livro livro;
  private Usuario usuario;
  
  //constructor
  public Emprestimo(
    Livro livro,
    Usuario usuario,
    Date dataRetirada,
    Date dataDevolucao
  ){
    //definindo valores
    this.livro = livro;
    this.usuario = usuario;
    this.dataRetirada = dataRetirada;
    this.dataDevolucao = dataDevolucao;
    
    //adicionar livro na lista de livros do usuário   
    usuario.getLivrosEmprestados().add(livro);
    
    livro.setIsDisponivel(false);
  }
  
  //getters
  public Date getDataRetirada(){
    return this.dataRetirada;
  }
  
  public Date getDataDevolucao(){
    return this.dataDevolucao;
  }
  
  public Livro getLivro(){
    return this.livro;
  }
  
  public Usuario getUsuario(){
    return this.usuario;
  }
}
