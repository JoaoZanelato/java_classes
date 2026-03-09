package one.digitalinnovation;

public class CircularList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int list_size;

    public CircularList() {
        this.list_size = 0;
        this.tail = null;
        this.head = null;
    }

    public void add(T content){
        Node<T> newNode = new Node<>(content);

        if(this.isEmpty()){
            this.head = newNode;
            this.tail = newNode;

            this.head.setNextNode(this.head);
        } else {

            this.tail.setNextNode(newNode); // O antigo último aponta para o novo
            newNode.setNextNode(this.head); // O novo aponta para o primeiro (fechando o círculo)
            this.tail = newNode;            // A placa de "fim" passa a ser o novo nó
        }
        this.list_size++;
    }

    public void remove(int index){
        if(index >= list_size || index < 0)
            throw new IndexOutOfBoundsException("Índice fora dos limites da lista");


        if(index == 0){ // Se queremos remover a cabeça (head)
            if(this.list_size == 1) { // Se só tem 1 elemento, zera tudo
                this.head = null;
                this.tail = null;
            } else {
                this.head = this.head.getNextNode(); // A cabeça passa a ser o segundo vagão
                this.tail.setNextNode(this.head);    // A cauda agora aponta para a NOVA cabeça
            }
        } else { // Se queremos remover do meio ou do fim
            // Pegamos o no ANTERIOR ao que queremos remover
            Node<T> previous = this.getNode(index - 1);
            Node<T> toRemove = previous.getNextNode();

            // O anterior pula o nó removido e aponta para o da frente
            previous.setNextNode(toRemove.getNextNode());

            // Se o que nós removemos era o ÚLTIMO (tail), o "previous" passa a ser o novo tail!
            if(index == this.list_size - 1) {
                this.tail = previous;
            }
        }
        this.list_size--;
    }

    public boolean isEmpty(){
        return this.list_size == 0;
    }

    public int size(){
        return this.list_size;
    }

    public T get(int index){
        return this.getNode(index).getContent();
    }

    private Node<T> getNode(int index) {
        if (this.isEmpty() || index < 0 || index >= list_size)
            throw new IndexOutOfBoundsException("Lista vazia ou Índice inválido");

        Node<T> current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.getNextNode();
        }
        return current;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[] (Lista Vazia)";

        StringBuilder str = new StringBuilder();
        Node<T> current = this.head; // Começa a imprimir pela cabeça

        for(int i = 0; i < this.size(); i++){
            str.append("[Node: ").append(current.getContent()).append("] ---> ");
            current = current.getNextNode();
        }

        str.append("(Retorna ao Head)");

        return str.toString();
    }
}