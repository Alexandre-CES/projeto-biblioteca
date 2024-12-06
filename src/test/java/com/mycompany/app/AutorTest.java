package com.mycompany.app;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class AutorTest {
    @Test
    public void testGetNomeNacionalidade(){

        Autor autor = new Autor("autor","nacionalidade");

        assertEquals("autor", autor.getNome());
        assertEquals("nacionalidade", autor.getNacionalidade());
    }

    @Test
    public void testGetObrasPublicadas(){
        Autor autor = new Autor("autor","nacionalidade");

        ArrayList<Livro> livros = new ArrayList<>();

        Livro livro1 = new Livro("livro1", autor,"genero");
        Livro livro2 = new Livro("livro2",autor,"genero");

        livros.add(livro1);
        livros.add(livro2);

        autor.setLivros(livros);

        assertEquals(livros, autor.getObrasPublicadas());
    }

    @Test
    public void testGetObrasPublicadasPorGenero(){
        Autor autor = new Autor("autor","nacionalidade");

        ArrayList<Livro> livros = new ArrayList<>();

        Livro livro1 = new Livro("livro1", autor,"genero");
        Livro livro2 = new Livro("livro2",autor,"desejado");

        livros.add(livro1);
        livros.add(livro2);

        autor.setLivros(livros);

        ArrayList<Livro> livroDesejado = new ArrayList<>();
        livroDesejado.add(livro2);

        assertEquals(livroDesejado, autor.getObrasPublicadasPorGenero("desejado"));
    }
}