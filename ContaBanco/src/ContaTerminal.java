import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua conta: ");
        int numeroConta = input.nextInt();
        System.out.println("Digite o número da sua Agência: ");
        String numeroAgencia = input.next();
        System.out.println("Digite seu nome: ");
        String nomeCliente = input.next();
        System.out.println("Digite seu saldo: ");
        double saldo = input.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %f já está disponível para saque", nomeCliente, numeroAgencia, numeroConta,  saldo);
    }
}