package one.digitalinnovation;

public class Node<T> {

    private Object object;
    private Node ref;

    public Node(T obj){
        this.object = obj;
        this.ref = null;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public Node getNextNode() {
        return ref;
    }

    public void setNextNode(Node ref) {
        this.ref = ref;
    }

    @Override
    public String toString() {
        return "Node{" +
                "object=" + object +
                '}' + "---->";
    }
}
