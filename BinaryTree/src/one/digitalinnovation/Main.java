package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {
        // Criando uma Árvore Binária de números Inteiros
        BinaryTree<Integer> tree = new BinaryTree<>();

        System.out.println("1. Inserindo nós na Árvore Binária...");

        // Vamos montar a seguinte árvore estruturalmente:
        //             10
        //           /    \
        //          5      15
        //         / \    /  \
        //        3   7  12   18

        tree.insert(10); // Raiz
        tree.insert(5);  // Vai para a esquerda do 10
        tree.insert(15); // Vai para a direita do 10
        tree.insert(3);  // Esquerda do 5
        tree.insert(7);  // Direita do 5
        tree.insert(12); // Esquerda do 15
        tree.insert(18); // Direita do 15

        System.out.println("\n2. Testando as exibições (Travessias):");

        // O InOrder DEVE imprimir os números em ordem crescente.
        // Esperado: 3, 5, 7, 10, 12, 15, 18
        tree.showInOrder();

        // O PreOrder imprime primeiro a Raiz, depois desce pela esquerda, depois direita.
        // Esperado: 10, 5, 3, 7, 15, 12, 18
        tree.showPreOrder();

        // O PostOrder imprime as folhas (filhos) primeiro, subindo até a Raiz por último.
        // Esperado: 3, 7, 5, 12, 18, 15, 10
        tree.showPostOrder();

        System.out.println("\n3. Testando a remoção:");
        System.out.println("Tentando remover o nó 5...");
        tree.remove(5);

        System.out.println("\nÁrvore InOrder após remoção do 5:");
        tree.showInOrder();
    }
}