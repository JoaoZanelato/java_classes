package one.digitalinnovation;

public class Stack {

    private Node refTopPile;

    public Stack() {
        this.refTopPile = null;
    }

    public boolean isEmpty() {
        return this.refTopPile == null;
    }
    //Olha que está no topo
    public Node top() {
        return this.refTopPile;
    }

    //Adiciona ao topo
    public void push(int value) {
        //Salva o topo atual
        Node aux = this.refTopPile;
        //Novo nó assume a posição do topo
        refTopPile = new Node(value);
        //Novo topo aponta para o antigo topo (que está embaixo dele)
        refTopPile.setRef(aux);
    }

    //Tira o elemento do topo e o retorna
    public Node pop() {
        if(!this.isEmpty()) {
            //Pega nó do topo
            Node poped = refTopPile;
            //O topo passa a ser o que estava abaixo
            refTopPile = refTopPile.getRef();
            // Devolve quem foi retirado
            return poped;
        }
        return null;
    }

    @Override
    public String toString() {

        String retorno = "------------\n";
        retorno += "     Stack\n";
        retorno += "------------\n";

        Node aux = this.refTopPile;

        while(true){
            if(aux != null){
                retorno += aux.toString();
                aux=aux.getRef(); //pega referência do nó abaixo, criando um loop até a ref == null (final)
            }
            else {
                break;
            }
        }
        retorno += "============";
        return retorno;
    }
}
