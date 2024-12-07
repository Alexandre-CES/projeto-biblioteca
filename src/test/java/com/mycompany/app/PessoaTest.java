package com.mycompany.app;
import org.junit.Test;

import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Livro;
import com.mycompany.app.Model.Pessoa;

import static org.junit.Assert.*;
import java.util.ArrayList;

public class PessoaTest{
    @Test
    public void testGetNome(){
        // Cria uma instância da classe Pessoa

        Pessoa pessoa = new Pessoa("Jess");

        assertEquals("Jess", pessoa.getNome());
    }

    @Test
    public void testGetLivros(){

        //instantiate Pessoa and Autor
        Pessoa pessoa = new Pessoa("Pessoa");
        Autor autor = new Autor("autor","inexistente");

        //instantiate two books  
        Livro livro1 = new Livro("Livro 1",autor,"livro");
        Livro livro2 = new Livro("livro2",autor,"livro");

        //Create new ArrayList and add books
        ArrayList<Livro> livros = new ArrayList<>();
        livros.add(livro1);
        livros.add(livro2);

        //set pessoa books and asser equals
        pessoa.setLivros(livros);
        assertArrayEquals(livros.toArray(), pessoa.getLivros().toArray());
    }
}

//instancia de pessoa com um nome

//getNome
//retorna nome da pessoa
//comparar com o nome que passei no setNome

//setNome OBS: eu fiz Pessoa com um constructor, então não possuo setNome
//atribuir um valor para a propriedade nome
//comparar se valor de getNome é o mesmo passado no setNome

//getLivros
//atribuir uma lista de livros para uma pessoa
//comparar se a lista retornada é a mesma que passamos para o setLivros

//setLivros
//atribuir uma lista de livros para uma pessoa
//comparar se o valor do getNome é a mesmo que passamos no setLivros