package com.node;

//ESTRUTURA BASE DE NÓ
public class Node<T> {

    private T conteudo;
    private Node next_node;

    public Node(T conteudo) {
        this.next_node = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public Node getNext_node() {
        return next_node;
    }

    public void setNext_node(Node<T> next_node) {
        this.next_node = next_node;
    }

    @Override
    public String toString() {
        return "com.node.Node{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
