package one.digitalinnovation;

public class LinkedList<T> {

    // O "refEntry" é a cabeça (head) da lista. É a única porta de entrada.
    // Se perdermos a referência dele, perdemos toda a lista.
    private Node<T> refEntry;

    public LinkedList() {
        this.refEntry = null; // Quando a lista nasce, ela está vazia
    }

    // Conta quantos elementos existem na lista caminhando vagão por vagão
    public int size() {
        int listSize = 0;
        Node<T> current = this.refEntry; // Começa pelo primeiro vagão

        while (current != null) {        // Enquanto houver um vagão...
            listSize++;                  // Conta +1
            current = current.getNextNode(); // Pula para o próximo vagão
        }
        return listSize;
    }

    // Adiciona um elemento no FINAL da lista
    public void add(T conteudo){
        Node<T> newNode = new Node<>(conteudo); // 1. Cria o novo vagão

        // 2. Se a lista estiver vazia, o novo vagão se torna o primeiro (a cabeça)
        if (this.isEmpty()) {
            this.refEntry = newNode;
            return;
        }

        // 3. Se não estiver vazia, precisamos encontrar o ÚLTIMO vagão para pendurar o novo
        Node<T> aux = this.refEntry; // Começa no primeiro vagão

        // Caminha até o último vagão (o laço para antes do tamanho total para pegar o último elemento válido)
        for (int i = 0; i < this.size() - 1; i++) {
            aux = aux.getNextNode(); // Aux avança de vagão em vagão
        }

        // 4. Agora que 'aux' é o último vagão, fazemos a corda dele apontar para o novo vagão
        aux.setNextNode(newNode);
    }

    // Remove um nó em uma posição específica
    public T remove(int index) {
        Node<T> toRemove = this.getNode(index); // Pega o nó que queremos excluir

        // Se quisermos remover o primeiro da lista (índice 0)
        if (index == 0) {
            // A cabeça da lista passa a ser o segundo vagão. O antigo primeiro fica solto na memória.
            refEntry = toRemove.getNextNode();
            return toRemove.getConteudo();
        }

        // Se for no meio ou no final:
        // Pega o vagão que está ANTES daquele que queremos remover
        Node<T> previous = getNode(index - 1);

        // Faz a corda do vagão anterior apontar para o vagão que está DEPOIS do que vai ser removido (pulando ele)
        previous.setNextNode(toRemove.getNextNode());

        return toRemove.getConteudo();
    }

    // Verifica se o índice pedido não extrapola o tamanho real do trem
    public void isIndexValid(int index){
        if(index < 0 || index >= this.size()){
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + ". \n Esta lista só vai até " + (this.size()-1));
        }
    }

    // Método privado auxiliar que viaja pela lista até chegar no índice exato solicitado
    private Node<T> getNode(int index){
        isIndexValid(index); // Trava de segurança

        Node<T> current = this.refEntry; // Começa no primeiro vagão
        Node<T> retorno = null;

        // Pula de vagão em vagão a quantidade de vezes equivalente ao índice
        for (int i = 0; i <= index; i++) {
            retorno = current;
            current = current.getNextNode();
        }
        return retorno; // Retorna o vagão encontrado
    }

    // Apenas retorna o valor contido no vagão de um determinado índice
    public T get(int index){
        return getNode(index).getConteudo();
    }

    // Se o refEntry é nulo, significa que não há nenhum vagão ancorado
    public boolean isEmpty() {
        return refEntry == null;
    }

    // Imprime a lista formatada iterando sobre todos os nós
    @Override
    public String toString() {
        String retorno = "";
        Node<T> current = this.refEntry;

        for (int i = 0; i < this.size(); i++) {
            retorno += current.toString() + " -> "; // Concatena a string do nó atual
            current = current.getNextNode(); // Avança para o próximo
        }
        retorno += "null"; // Indica o fim da lista

        return retorno;
    }
}