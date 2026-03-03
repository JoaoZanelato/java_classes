import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected List<Transacao> historico; // Novo atributo

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.historico = new ArrayList<>();
    }

    @Override
    public void sacar(double valor) {
        if (valor > saldo) {
            throw new RuntimeException("Saldo insuficiente para o saque de R$ " + valor);
        }
        saldo -= valor;
        historico.add(new Transacao("Saque", valor));
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        historico.add(new Transacao("Depósito", valor));
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s (CPF: %s)", this.cliente.getNome(), this.cliente.getCpf()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: R$ %.2f", this.saldo));

        System.out.println("--- Histórico de Transações ---");
        if (historico.isEmpty()) {
            System.out.println("Nenhuma transação realizada.");
        } else {
            for (Transacao t : historico) {
                System.out.println(t.toString());
            }
        }
        System.out.println("-------------------------------");
    }
}