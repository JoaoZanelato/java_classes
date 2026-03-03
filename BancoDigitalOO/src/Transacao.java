import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transacao {
    private String tipo;
    private double valor;
    private LocalDateTime data;

    public Transacao(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = LocalDateTime.now();
    }

    @Override
    public String toString() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return String.format("%s - %s: R$ %.2f", data.format(formatador), tipo, valor);
    }
}