package com.mycompany.app;
import org.junit.Test;
import static org.junit.Assert.*;

public class LivroTest {
    @Test
    public void testGetTituloAutorGenero(){
        Autor autor = new Autor("autor","nacionalidade");

        Livro livro = new Livro("livro",autor,"genero");

        assertEquals("livro", livro.getTitulo());
        assertEquals(autor, livro.getAutor());
        assertEquals("genero", livro.getGenero());
    }

    @Test
    public void testIsDisponivel(){
        Autor autor = new Autor("autor","nacionalidade");

        Livro livro = new Livro("livro",autor,"genero");

        livro.setIsDisponivel(false);

        assertEquals(false, livro.isDisponivel());
    }
}
