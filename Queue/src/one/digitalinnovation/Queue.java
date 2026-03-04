package one.digitalinnovation;

public class Queue<T> {

    private Node refEntry;

    public Queue() {
        this.refEntry = null;
    }

    public boolean isEmpty(){
        return refEntry == null;
    }

    public void enqueue(T object){
        Node newNode = new Node(object);
        newNode.setNextNode(refEntry);
        refEntry = newNode;
    }

    public T first(){
        if(!isEmpty()){
            Node primeiroNo = refEntry;
            while (true){
                if(primeiroNo.getNextNode() != null){
                   primeiroNo = primeiroNo.getNextNode();
                }
                else {
                    break;
                }
            }
            return (T) primeiroNo;
        }
        return null;
    }

    public T dequeue(){
        if(!isEmpty()){
            Node primeiroNo = refEntry;
            Node auxNode = refEntry;
            while (true){
                if(primeiroNo.getNextNode() != null){
                    auxNode = primeiroNo;
                    primeiroNo = primeiroNo.getNextNode();
                }
                else {
                    auxNode.setNextNode(null);
                    break;
                }
            }
            return (T) primeiroNo;
        }
        return null;
    }

    @Override
    public String toString() {
        String retorno = "";

        Node aux = refEntry;
        if(refEntry != null){
            while (true){
                retorno += aux;
                if (aux.getNextNode() != null){
                    aux = aux.getNextNode();
                }
                else {
                    break;
                }
            }
        }else {
            retorno = null;
        }
        return retorno;
    }
}
