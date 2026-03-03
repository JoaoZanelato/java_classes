package com.node;

public class Main {
    public static void main(String[] args) {
        Node<String> node1 = new Node<String>("no1");
        Node<String> node2 = new Node<String>("no2");
        Node<String> node3 = new Node<String>("no3");
        Node<String> node4 = new Node<String>("no4");


        node1.setNext_node(node2);
        node2.setNext_node(node3);
        node3.setNext_node(node4);

        System.out.println(node1);
        System.out.println(node1.getNext_node());
        System.out.println(node1.getNext_node().getNext_node());
        System.out.println(node1.getNext_node().getNext_node().getNext_node());
        System.out.println(node1.getNext_node().getNext_node().getNext_node().getNext_node());

    }
}
