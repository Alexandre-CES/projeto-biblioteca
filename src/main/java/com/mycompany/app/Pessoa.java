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
  protected String getNome(){
    return this.nome;
  }
  
  protected ArrayList<Livro> getLivros(){
    return this.livros;
  }
  
  protected int getQuantidadeMaxLivros(){
    return this.quantidadeMaxLivros;
  }

  //setters
  protected void setLivros(ArrayList<Livro> livros){
    this.livros = livros;
  }
  
  protected void setQuantidadeMaxLivros(int quantidade){
    this.quantidadeMaxLivros = quantidade;
  }

}
