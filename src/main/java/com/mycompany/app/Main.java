package com.mycompany.app;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.Locale;

public class Main{
  public static void main(String[] args){

    Autor autor = new Autor("Antoine de Saint-Exupéry", "Francês");
    autor.setMaxObras(9);

    Livro livro = new Livro("O Pequeno Príncipe", autor, "Literatura infantil");
    ArrayList<Livro> livros = new ArrayList<>();
    livros.add(livro);
    autor.setLivros(livros);

    Usuario usuario1 = new Usuario("Lucas", 13);
    usuario1.setMaxLivrosEmprestados(2);

    //primeira simulação de emprestimo, sem mostrar output
    try {
    
      //configurando formato
      SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH);
      
      //converter string para date
      Date dataRetirada = sdf.parse("Wed May 08 23:37:21 BRT 2024");
      Date dataDevolucao = sdf.parse("Wed May 08 23:37:21 BRT 2024");

      Emprestimo emprestimo = new Emprestimo(livro, usuario1, dataRetirada, dataDevolucao);

      Usuario usuario2 = new Usuario("Pedro", 12);
      usuario2.setMaxLivrosEmprestados(2);
      
      //segunda simulação de emprestimo. Se não funcionar, deu certo
      fazerEmprestimo(livro, usuario2, sdf, dataRetirada, dataDevolucao);
      
    } catch (ParseException e) {
      System.out.println("(1)Erro ao formatar a data: " + e.getMessage());
    }
  }
  
  public static void fazerEmprestimo(Livro livro, Usuario usuario, SimpleDateFormat sdf, Date dataRetirada, Date dataDevolucao){
    
    int livrosComUsuario = usuario.getLivrosEmprestados().size();
    int livrosMaxUsuario = usuario.getMaxLivrosEmprestados();
    
    if(livrosComUsuario >= livrosMaxUsuario){
      System.out.println("Quantidade máxima de livros para usuário atingida");
      return;
    }
    
    //getting strings
    Autor autor = livro.getAutor();
    String titulo = livro.getTitulo();
    String autorName = autor.getNome();
    String genero = livro.getGenero();
    String nome = usuario.getNome();
    int idade = usuario.getIdade();
    String dataRetiradaStr = sdf.format(dataRetirada);
    String dataDevolucaoStr = sdf.format(dataDevolucao);
    
    //showing op infos
    livro.validarDisponibilidade();
    System.out.println("Livro: " + titulo);
    System.out.println("Autor: " + autorName);
    System.out.println("Gênero: " + genero);
    System.out.println("Usuario: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Data de Retirada: " + dataRetiradaStr);
    System.out.println("Data de Devolução: " + dataDevolucaoStr);
    
    //fazer operação de livro estiver disponível
    if(livro.isDisponivel()){
      Emprestimo emprestimo = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);
    }else{
      return;
    }
  }
}
