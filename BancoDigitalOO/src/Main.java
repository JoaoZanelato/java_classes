import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Banco meuBanco = new Banco();
        meuBanco.setNome("Banco Java Dev");

        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");
        venilton.setCpf("123.456.789-00");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        // Adicionando contas ao banco
        meuBanco.setContas(Arrays.asList(cc, poupanca));

        // Testando as movimentações
        cc.depositar(250);
        cc.transferir(100, poupanca);
        poupanca.sacar(50);

        // Testando exceção de saldo insuficiente
        try {
            cc.sacar(500);
        } catch (RuntimeException e) {
            System.out.println("Erro capturado: " + e.getMessage());
            System.out.println();
        }

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        System.out.println();
        meuBanco.listarContas();
    }
}