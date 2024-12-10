package com.mycompany.app.Model;

import com.mycompany.app.Interface.EstrategiaPublicacao;

public class UsuarioDecorator implements EstrategiaPublicacao{
    private EstrategiaPublicacao estrategiaPublicacao;;

    public void setEstrategiaPublicacao(EstrategiaPublicacao estrategia){
        this.estrategiaPublicacao = estrategia;
    }

    @Override
    public void publicar() {
        if (this.estrategiaPublicacao == null) {
            System.out.println("Nenhuma estratégia definida para publicação.");
        } else {
            this.estrategiaPublicacao.publicar();
        }
    }
}
