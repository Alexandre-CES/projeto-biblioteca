import java.util.ArrayList;

public class Autor extends Pessoa{
  private String nacionalidade;

  //constructor
  public Autor(String nome, String nacionalidade){
    super(nome);
    this.nacionalidade = nacionalidade;
  }
  
  //getters
  public String getNome(){
    return super.getNome();
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
  public void setMaxObras(int quantidade){
    super.setQuantidadeMaxLivros(quantidade);
  }

  public void setLivros(ArrayList<Livro> livros){
    super.setLivros(livros);
  }
}
