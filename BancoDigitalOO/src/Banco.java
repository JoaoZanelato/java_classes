import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    // Novo método útil para admin
    public void listarContas() {
        System.out.println("=== Lista de Contas - Banco " + this.nome + " ===");
        if (contas != null && !contas.isEmpty()) {
            for (Conta conta : contas) {
                System.out.println("Ag: " + conta.getAgencia() + " | CC: " + conta.getNumero() + " | Titular: " + conta.getCliente().getNome());
            }
        } else {
            System.out.println("Nenhuma conta registrada.");
        }
    }
}