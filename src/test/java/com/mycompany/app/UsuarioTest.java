package com.mycompany.app;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Date;

public class UsuarioTest {

    @Test
    public void testGetNomeIdade(){
        Usuario usuario = new Usuario("nome", 18);

        assertEquals("nome", usuario.getNome());
        assertEquals(18, usuario.getIdade());
    }

    @Test
    public void testGetMaxLivrosEmprestados(){
        Usuario usuario = new Usuario("nome", 18);

        usuario.setMaxLivrosEmprestados(2);

        assertEquals(2, usuario.getMaxLivrosEmprestados());
    }

    @Test
    public void testGetLivrosEmprestados(){
        Usuario usuario = new Usuario("nome", 18);

        Autor autor = new Autor("nome","nacionalidade");
        Livro livro = new Livro("livro", autor,"genero");
        ArrayList<Livro> livros = new ArrayList<>();
        livros.add(livro);

        usuario.setLivros(livros);

        assertArrayEquals(livros.toArray(), usuario.getLivrosEmprestados().toArray());
    }

    @Test
    public void testGestHistoricoEmprestimos(){
        Usuario usuario = new Usuario("nome", 18);

        Autor autor = new Autor("nome","nacionalidade");
        Livro livro = new Livro("livro", autor,"genero");

        Emprestimo emprestimo = new Emprestimo(livro,usuario, new Date(), new Date());

        Emprestimo[] emprestimos = new Emprestimo[1];

        emprestimos[0] = emprestimo;

        assertArrayEquals(emprestimos, usuario.getHistoricoEmprestimos().toArray());
    }
}
