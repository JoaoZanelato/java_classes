package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {

        // Instancia a Lista Encadeada tipada para receber Números Inteiros
        LinkedList<Integer> lista = new LinkedList<>();

        // Adiciona 10 elementos (de 0 a 9).
        for (int i = 0; i < 10; i++) {
            lista.add(i);
        }

        // O System.out.println automaticamente chama o método toString() da classe LinkedList
        System.out.println("Nossa Lista Encadeada:");
        System.out.println(lista);

        // Testando as outras funcionalidades
        System.out.println("\nPegando o elemento do índice 3: " + lista.get(3));

        System.out.println("\nRemovendo o elemento do índice 3...");
        lista.remove(3);

        System.out.println("Lista após a remoção (o número 3 deve sumir):");
        System.out.println(lista);
    }
}