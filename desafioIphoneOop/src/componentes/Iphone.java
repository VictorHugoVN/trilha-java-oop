package componentes;

public class Iphone extends AparelhoTelefonico implements ReprodutorMusical, NavegadorInternet{

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página na web");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador");
    }

    @Override
    public void atualizarPágina() {
        System.out.println("Atualizando página web");
    }

    @Override
    public void tocar() {
       System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }

    @Override
    public void ligar() {
       System.out.println("Ligando para alguém");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    
    
}
