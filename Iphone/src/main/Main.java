package main;

import interfaces.apps.AparelhoTelefonico;
import interfaces.apps.Navegador;
import interfaces.apps.ReprodutorMusical;
import phone.Iphone;

public class Main {
    public static void main(String[] args) {

        // Instanciamos o objeto concreto na memória
        Iphone meuIphone = new Iphone();

        System.out.println("--- USO DIRETO (O objeto sendo ele mesmo) ---");
        meuIphone.ligar("54 99999-9999");
        meuIphone.selecionarMusica("Guns N' Roses - Sweet Child O' Mine");
        meuIphone.adicionarNovaAba();

        System.out.println("\n--- TESTANDO O POLIMORFISMO (O objeto assumindo várias formas) ---");

        // 1. Olhando para o iPhone através da "lente" de um Reprodutor Musical
        ReprodutorMusical ipod = meuIphone;
        ipod.abrir();
        ipod.tocar();

        // 2. Olhando para o mesmo iPhone através da "lente" de um Navegador
        Navegador safari = meuIphone;
        safari.exibirPagina("https://www.github.com");

        // 3. Olhando para o mesmo iPhone através da "lente" de um Aparelho Telefônico
        AparelhoTelefonico telefone = meuIphone;
        telefone.atender();
    }
}