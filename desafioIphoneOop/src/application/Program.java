package application;

import componentes.Iphone;

public class Program {
    public static void main(String[] args){
        
        Iphone iphone = new Iphone();

        //Métodos referentes ao reprodutor musical
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        //Métodos referentes ao aparelho telefônico
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        //Métodos referentes ao navegador de internet
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPágina();

    }
    
}
