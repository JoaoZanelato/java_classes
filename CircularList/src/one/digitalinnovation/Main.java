package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {

        // Vamos criar uma lista circular de Strings
        CircularList<String> listaCircular = new CircularList<>();

        System.out.println("1. Estado inicial da Lista Circular:");
        System.out.println(listaCircular);

        System.out.println("\n2. A adicionar vagões ao nosso comboio circular...");
        listaCircular.add("Vagão A (Índice 0)");
        listaCircular.add("Vagão B (Índice 1)");
        listaCircular.add("Vagão C (Índice 2)");
        listaCircular.add("Vagão D (Índice 3)");

        // Esperado: Vagão A -> Vagão B -> Vagão C -> Vagão D -> (Retorna ao Head)
        System.out.println(listaCircular);
        System.out.println("Tamanho atual: " + listaCircular.size());

        System.out.println("\n3. A testar o método get:");
        System.out.println("Quem está no índice 2? " + listaCircular.get(2)); // Esperado: Vagão C

        System.out.println("\n4. TESTE CRÍTICO: Remover a Cabeça (Head - Índice 0)");
        System.out.println("A remover o Vagão A...");
        listaCircular.remove(0);

        // Se a lógica da Lista Circular estiver certa, o Vagão D (Tail) agora deve apontar para o Vagão B (Novo Head)
        // Esperado: Vagão B -> Vagão C -> Vagão D -> (Retorna ao Head)
        System.out.println(listaCircular);

        System.out.println("\n5. A remover um vagão do meio (Índice 1)...");
        System.out.println("A remover o Vagão C...");
        listaCircular.remove(1);

        // Esperado: Vagão B -> Vagão D -> (Retorna ao Head)
        System.out.println(listaCircular);

        System.out.println("\n6. A remover o último elemento (Tail - Índice 1)...");
        System.out.println("A remover o Vagão D...");
        listaCircular.remove(1);

        // Esperado: Vagão B -> (Retorna ao Head - aponta para si mesmo)
        System.out.println(listaCircular);

        System.out.println("\n7. A esvaziar a lista...");
        listaCircular.remove(0);
        System.out.println(listaCircular);
        System.out.println("A lista está vazia? " + listaCircular.isEmpty());
    }
}