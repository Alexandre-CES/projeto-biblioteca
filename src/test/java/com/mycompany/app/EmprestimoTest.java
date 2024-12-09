package com.mycompany.app;
import org.junit.Test;

import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Emprestimo;
import com.mycompany.app.Model.Livro;
import com.mycompany.app.Model.Usuario;

import static org.junit.Assert.*;
import java.util.Date;

public class EmprestimoTest {
    
    @Test
    public void testInstantiateEmprestimo(){

        Autor autor = new Autor("autor","nacionalidade",false);
        Livro livro = new Livro("nome", autor,"genero");
        Usuario usuario = new Usuario("nome",18);

        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();

        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);

        assertEquals(livro, emprestimo.getLivro());
        assertEquals(usuario, emprestimo.getUsuario());
        assertEquals(dataRetirada, emprestimo.getDataRetirada());
        assertEquals(dataDevolucao, emprestimo.getDataDevolucao());
    } 

    /* 
        Eu até ia fazer uma função para cada um dos getters, mas 
    não vi necessidade de instanciar um novo Emprestimo toda vez. 
    Já que eu preciso entregar todas as informaçõesde uma vez na 
    hora de instanciar, eu também as testei em conjunto
    */
    
}
