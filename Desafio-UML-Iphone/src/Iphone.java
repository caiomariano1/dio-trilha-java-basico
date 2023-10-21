import Entidades.AparelhoTelefonico;
import Entidades.NavegadorInternet;
import Entidades.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        // Testando o Aparelho
        iphone.fazerLigacao();
        iphone.atenderChamada();
        iphone.iniciarCorreioVoz();

        // Testando o Navegador
        iphone.exibirPagina();
        iphone.adicionarAba();
        iphone.atualizarPagina();

        // Testando o Reprodutor
        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.selecionarMusica();

    }

    //Aparelho
    @Override
    public void fazerLigacao() {
        System.out.println("Iniciando uma chamada...");
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo uma chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Você possui novas mensagens!");
    }

    //Navegador
    @Override
    public void exibirPagina() {
        System.out.println("Página aberta");
    }

    @Override
    public void adicionarAba() {
        System.out.println("Entrando em uma página Web");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada com sucesso");
    }

    //Reprodutor
    @Override
    public void tocarMusica() {
        System.out.println("Tocando Música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando a Música...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música Selecionada");
    }
}
