package phone;

import interfaces.apps.AparelhoTelefonico;
import interfaces.apps.Navegador;
import interfaces.apps.ReprodutorMusical;

public class Iphone implements Navegador, AparelhoTelefonico, ReprodutorMusical {

    // --- Métodos herdados da interface base (Aplicativo) ---
    @Override
    public void abrir() {
        System.out.println("Iniciando o aplicativo no iPhone...");
    }

    @Override
    public void fechar() {
        System.out.println("Encerrando o aplicativo no iPhone...");
    }

    // --- Métodos da interface Navegador ---
    @Override
    public void adicionarNovaAba() {
        System.out.println("Navegador: Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Navegador: Atualizando a página atual.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Navegador: Exibindo a página " + url);
    }

    // --- Métodos da interface AparelhoTelefonico ---
    @Override
    public void atender() {
        System.out.println("Telefone: Atendendo a chamada recebida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Telefone: Iniciando o correio de voz.");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Telefone: Ligando para o número " + numero);
    }

    // --- Métodos da interface ReprodutorMusical ---
    @Override
    public void tocar() {
        System.out.println("iPod: Tocando a música.");
    }

    @Override
    public void pausar() {
        System.out.println("iPod: Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("iPod: A música '" + musica + "' foi selecionada.");
    }
}