package interfaces.apps;

import interfaces.aplicativo.Aplicativo;

public interface AparelhoTelefonico extends Aplicativo {
    void atender();
    void iniciarCorreioVoz();
    void ligar(String numero);
}
