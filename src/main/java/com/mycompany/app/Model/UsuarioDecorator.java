package com.mycompany.app.Model;

import com.mycompany.app.Interface.PublicavelInterface;

public class UsuarioDecorator implements PublicavelInterface{
    private PublicavelInterface usuario;

    public UsuarioDecorator(PublicavelInterface usuario){
        this.usuario = usuario;
    }

    public void publicar(){
        usuario.publicar();
        System.out.println("Publicando como usuário...");
    }
}
