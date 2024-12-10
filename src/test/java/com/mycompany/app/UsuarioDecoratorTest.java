package com.mycompany.app;
import org.junit.Test;

import com.mycompany.app.Model.UsuarioDecorator;
import com.mycompany.app.Model.EstrategiaPublicacaoArtigo;
import com.mycompany.app.Model.EstrategiaPublicacaoLivro;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class UsuarioDecoratorTest {
    
    @Test
    public void testPublicarComoArtigo(){
        UsuarioDecorator usuario = new UsuarioDecorator();

        EstrategiaPublicacaoArtigo estrategiaArtigo = new EstrategiaPublicacaoArtigo();

        usuario.setEstrategiaPublicacao(estrategiaArtigo);

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        usuario.publicar();
        assertEquals("Publicando como artigo...\n", outContent.toString());
        
    }

    @Test
    public void testPublicarComoLivro(){
        UsuarioDecorator usuario = new UsuarioDecorator();

        EstrategiaPublicacaoLivro estrategiaLivro = new EstrategiaPublicacaoLivro();

        usuario.setEstrategiaPublicacao(estrategiaLivro);

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        usuario.publicar();
        assertEquals("Publicando como livro...\n", outContent.toString());
    }
}
