package com.mycompany.app.Model;

import com.mycompany.app.Interface.EstrategiaPublicacao;

public class EstrategiaPublicacaoArtigo implements EstrategiaPublicacao{
    
    public void publicar(){
        System.out.println("Publicando como artigo...");
    }
}