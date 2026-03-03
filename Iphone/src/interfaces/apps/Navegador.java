package interfaces.apps;

import interfaces.aplicativo.Aplicativo;

public interface Navegador extends Aplicativo {
    void adicionarNovaAba();
    void atualizarPagina();
    void exibirPagina(String url);
}
