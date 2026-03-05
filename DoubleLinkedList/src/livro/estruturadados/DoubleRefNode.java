package livro.estruturadados;

import java.text.DecimalFormat;

public class DoubleRefNode<T> {

    private DoubleRefNode<T> previousNode, nextNode;
    private T content;

    public DoubleRefNode(T content) {
        this.content = content;
        this.previousNode = this.nextNode = null;
    }

    public DoubleRefNode(DoubleRefNode<T> previousNode, DoubleRefNode<T> nextNode, T content) {
        this.previousNode = previousNode;
        this.nextNode = nextNode;
    }

    public DoubleRefNode<T> getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(DoubleRefNode<T> previousNode) {
        this.previousNode = previousNode;
    }

    public DoubleRefNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoubleRefNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "DoubleRefNode{" +
                "content=" + content +
                '}';
    }

    // Retorna o conteúdo deste nó e encadeia a chamada para imprimir os próximos (usando recursividade)
    public String toStringLinked(){
        String string = "No{" +
                "conteudo="+ content +
                '}';

        if(nextNode != null){
            string += "->" + nextNode.toStringLinked(); // Chama o método do próximo nó
        }else {
            string += "->NULL"; // Chegou no fim da linha
        }

        return string;
    }
}

