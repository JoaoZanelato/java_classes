package livro.estruturadados;

public class DoubleLinkedList<T> {
    private DoubleRefNode<T> head, tail;
    private int size = -1; //Para trabalhar na lógica de índices

    public DoubleLinkedList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertAtTail(T content){
        DoubleRefNode<T> newNode = new DoubleRefNode<>(content);
        newNode.setPreviousNode(null);
        newNode.setNextNode(null);

        if(isEmpty()){

            newNode.setPreviousNode(null);

            // Ele é o primeiro e o último ao mesmo tempo.
            head = newNode;
            tail = newNode;
        }
        else{
            // 1. O novo nó olha para trás e "dá a mão" para o atual último nó (tail)
            newNode.setPreviousNode(tail);

            // 2. O atual último nó olha para frente e "dá a mão" para o novo nó
            tail.setNextNode(newNode);

            // 3. A lista atualiza sua referência de fim: o "tail" passa a ser o novo nó
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
        return index < 0 || index >= size;
    }
    private DoubleRefNode<T> getNode(int index){
        if(isIndexValid(index)){
            DoubleRefNode<T> current = head;
            for(int i = 0; i < index; i++){
                current = current.getNextNode();
            }
            return current;
        }
        return null;
    }

    public DoubleRefNode<T> get(int index){
        return getNode(index);
    }

    public String remove(int index){
        try {
            DoubleRefNode<T> toRemove = getNode(index);
            DoubleRefNode<T> previous = toRemove.getPreviousNode();
            DoubleRefNode<T> next = toRemove.getNextNode();
            if(previous == null && next == null){
                head = tail = null;
            }
            else if(previous == null){
                head = next;
            }
            else if(next == null){
                tail = previous;
            }
            else{
                previous.setNextNode(next);
                next.setPreviousNode(previous);
            }

            return toRemove.toString();
        }catch(IndexOutOfBoundsException e){
            return "INVALID INDEX = " + index + "\n" + e;
        }

    }

}