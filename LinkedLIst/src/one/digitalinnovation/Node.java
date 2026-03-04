package one.digitalinnovation;

// O <T> (Generics) permite que o nó guarde qualquer tipo de dado (Integer, String, etc.)
public class Node<T> {

    private T conteudo;       // A "carga" do vagão (o valor real que queremos guardar)
    private Node<T> nextNode; // A "corda" que aponta para o próximo vagão da lista

    // Construtor 1: Cria um nó vazio (sem conteúdo e sem próximo)
    public Node(){
        this.nextNode = null;
    }

    // Construtor 2: Cria um nó com conteúdo, mas que ainda não aponta para ninguém (vai para o final da lista)
    public Node(T conteudo){
        this.nextNode = null;
        this.conteudo = conteudo;
    }

    // Construtor 3: Cria um nó que já tem conteúdo e já sabe quem é o próximo vagão
    public Node(T conteudo, Node<T> nextNode){
        this.nextNode = nextNode;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    // Retorna apenas o conteúdo deste nó específico
    @Override
    public String toString() {
        return "Node{" +
                "conteudo=" + conteudo +
                '}';
    }

    // Retorna o conteúdo deste nó e encadeia a chamada para imprimir os próximos (usando recursividade)
    public String toStringLinked(){
        String string = "No{" +
                "conteudo="+ conteudo +
                '}';

        if(nextNode != null){
            string += "->" + nextNode.toStringLinked(); // Chama o método do próximo nó
        }else {
            string += "->NULL"; // Chegou no fim da linha
        }

        return string;
    }
}