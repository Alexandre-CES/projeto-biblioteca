import java.util.ArrayList;

public class Usuario extends Pessoa{
  private int idade;
  private Emprestimo[] historicoEmprestimos;

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
  
  public Emprestimo[] getHistoricoEmprestimos(){
    return this.historicoEmprestimos;
  }

  //setters
  public void setMaxLivrosEmprestados(int quantidade){
    super.setQuantidadeMaxLivros(quantidade);
  }
}
