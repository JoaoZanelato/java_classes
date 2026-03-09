package livro.estruturadados;

public class Main {
    public static void main(String[] args) {

        DoubleLinkedList<String> estacoes = new DoubleLinkedList<>();

        System.out.println("1. Estado inicial:");
        System.out.println(estacoes);

        System.out.println("\n2. Testar Inserções nas Pontas (Head e Tail):");
        estacoes.insertAtTail("Estação B (Fim)");
        estacoes.insertAtTail("Estação C (Fim)");
        estacoes.insertAtHead("Estação A (Início)");

        // Esperado: [ Estação A <-> Estação B <-> Estação C ]
        System.out.println(estacoes);

        System.out.println("\n3. Testar Inserção num Índice Específico (addAtIndex):");
        System.out.println("A inserir 'Estação X' no índice 1 (entre a A e a B)...");
        estacoes.addAtIndex("Estação X", 1);

        // Esperado: [ Estação A <-> Estação X <-> Estação B <-> Estação C ]
        System.out.println(estacoes);

        System.out.println("\n4. Testar a Busca (get):");
        System.out.println("Quem está no índice 2? " + estacoes.get(2)); // Deve ser a Estação B

        System.out.println("\n5. Testar Remoções:");

        System.out.println("A remover o índice 1 (Estação X)...");
        estacoes.remove(1); // Remove do meio
        System.out.println(estacoes);

        System.out.println("A remover o índice 0 (Estação A - Head)...");
        estacoes.remove(0); // Remove a cabeça
        System.out.println(estacoes);

        System.out.println("A remover o índice 1 (Estação C - Tail)...");
        estacoes.remove(1); // Remove a cauda
        System.out.println(estacoes);

        System.out.println("\n6. Esvaziar a lista:");
        System.out.println("A remover o último nó restante...");
        estacoes.remove(0);
        System.out.println(estacoes);
        System.out.println("A lista está vazia? " + estacoes.isEmpty());
    }
}