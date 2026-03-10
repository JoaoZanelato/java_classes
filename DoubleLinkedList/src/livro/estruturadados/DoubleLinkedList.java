package livro.estruturadados;

public class DoubleLinkedList<T> {
    private DoubleRefNode<T> head, tail;
    private int size = 0;

    public DoubleLinkedList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertAtTail(T content){
        DoubleRefNode<T> newNode = new DoubleRefNode<T>(content);
        newNode.setPreviousNode(null);
        newNode.setNextNode(null);

        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.setPreviousNode(tail);
            tail.setNextNode(newNode);
            tail = newNode;
        }
        size++;
    }

    public void insertAtHead(T content){
        DoubleRefNode<T> newNode = new DoubleRefNode<>(content);
        newNode.setPreviousNode(null);
        newNode.setNextNode(null);

        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else{
            head.setPreviousNode(newNode);
            newNode.setNextNode(head);
            head = newNode;
        }
        size++;
    }

    private boolean isIndexValid(int index){
        return index >= 0 && index < size;
    }

    private DoubleRefNode<T> getNode(int index){
        if(!isIndexValid(index)){

            throw new IndexOutOfBoundsException("Índice inexistente: " + index);
        }

        DoubleRefNode<T> current = head;
        for(int i = 0; i < index; i++){
            current = current.getNextNode();
        }
        return current;
    }

    public DoubleRefNode<T> get(int index){
        return getNode(index);
    }

    public String remove(int index){
        DoubleRefNode<T> toRemove = getNode(index);
        DoubleRefNode<T> previous = toRemove.getPreviousNode();
        DoubleRefNode<T> next = toRemove.getNextNode();

        if(previous == null && next == null){
            head = tail = null;
        }
        else if(previous == null){
            head = next;
            head.setPreviousNode(null);
        }
        else if(next == null){
            tail = previous;
            tail.setNextNode(null);
        }
        else{
            previous.setNextNode(next);
            next.setPreviousNode(previous);
        }
        size--;

        return toRemove.toString();
    }


    public String addAtIndex(T content, int index){

        if(index == 0){
            insertAtHead(content);
            return "ADDED AT INDEX 0";
        }

        if(index == size){
            insertAtTail(content);
            return "ADDED AT INDEX " + index;
        }

        DoubleRefNode<T> currentAtIndex = getNode(index);
        DoubleRefNode<T> previous = currentAtIndex.getPreviousNode();

        DoubleRefNode<T> newNode = new DoubleRefNode<>(content);

        newNode.setPreviousNode(previous);
        newNode.setNextNode(currentAtIndex);

        previous.setNextNode(newNode);
        currentAtIndex.setPreviousNode(newNode);

        size++;

        return "ADDED AT = " + index;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[] (Lista Vazia)";
        }

        StringBuilder builder = new StringBuilder();
        DoubleRefNode<T> current = head;

        builder.append("[ ");
        while (current != null) {
            builder.append(current.toString());
            if (current.getNextNode() != null) {
                builder.append(" <-> ");
            }
            current = current.getNextNode();
        }
        builder.append(" ]");

        return builder.toString();
    }
}