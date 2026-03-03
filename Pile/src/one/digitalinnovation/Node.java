package one.digitalinnovation;

public class Node {

    private int dado;
    private Node ref = null;

    public Node(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public Node getRef() {
        return ref;
    }

    public void setRef(Node ref) {
        this.ref = ref;
    }

    @Override
    public String toString() {
        return "Node{" +
                "dado=" + dado +
                '}' + "\n";
    }
}
