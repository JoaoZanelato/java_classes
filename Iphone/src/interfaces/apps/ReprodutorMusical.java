package interfaces.apps;

import interfaces.aplicativo.Aplicativo;

public interface ReprodutorMusical extends Aplicativo {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}
