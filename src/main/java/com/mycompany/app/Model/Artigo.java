package com.mycompany.app.Model;

import com.mycompany.app.Interface.AutorInterface;

public class Artigo implements AutorInterface{
    @Override
    public void publicar(){
      System.out.println("Artigo publicando...");
    }
}
