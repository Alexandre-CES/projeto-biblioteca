package com.mycompany.app;
import org.junit.Test;

import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Artigo;

import static org.junit.Assert.*;

public class ArtigoTest {
    @Test
    public void testGetGenero(){
        Autor autor = new Autor("autor", "nacionalidade", false);
        Artigo artigo = new Artigo("artigo",autor,"genero",true);

        assertEquals("genero", artigo.getGenero());
    }

    @Test
    public void testIsPublicado(){
        Autor autor = new Autor("autor", "nacionalidade", false);
        Artigo artigo = new Artigo("artigo",autor,"genero",true);

        assertEquals(true, artigo.isPublicado());
    }
}
