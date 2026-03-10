package one.digitalinnovation;

public class BinaryTree<T extends Comparable<T>> {
    private BinaryNode<T> root;

    public BinaryTree(){
        root = null;
    }

    public void insert(T obj){
        BinaryNode<T> newNode = new BinaryNode<>(obj);
        root = insert(root, newNode);
    }

    private BinaryNode<T> insert(BinaryNode<T> actual, BinaryNode<T> newNode){
        if(actual == null){
            return newNode;
        } else if(newNode.getObject().compareTo(actual.getObject()) < 0){
            actual.setLeft(insert(actual.getLeft(), newNode));
        }else{
            actual.setRight(insert(actual.getRight(), newNode));
        }
        return actual;
    }

    public void showInOrder(){
        System.out.println("\n InOrder Tree");
        showInOrder(this.root);
    }

    public void showPreOrder(){
        System.out.println("\n PreOrder Tree");
        showPreOrder(this.root);
    }

    public void showPostOrder(){
        System.out.println("\n PostOrder Tree");
        showPostOrder(this.root);
    }

    private void showInOrder(BinaryNode<T> actual){
        if(actual != null){
            showInOrder(actual.getLeft());
            System.out.print(actual.getObject()  + " ");
            showInOrder(actual.getRight());
        }
    }

    private void showPreOrder(BinaryNode<T> actual){
        if(actual != null){
            System.out.print(actual.getObject()  + " ");
            showPreOrder(actual.getLeft());
            showPreOrder(actual.getRight());
        }
    }

    private void showPostOrder(BinaryNode<T> actual){
        if(actual != null){
            showPostOrder(actual.getLeft());
            showPostOrder(actual.getRight());
            System.out.print(actual.getObject() + " ");
        }
    }

    public void remove(T obj){
        this.root = removeRecursive(this.root, obj);
    }

    private BinaryNode<T> removeRecursive(BinaryNode<T> current, T obj) {
        if (current == null) {
            System.out.println("\n[Aviso] Conteúdo " + obj + " não encontrado.");
            return null;
        }

        if (obj.compareTo(current.getObject()) < 0) {
            current.setLeft(removeRecursive(current.getLeft(), obj));
        }
        else if (obj.compareTo(current.getObject()) > 0) {
            current.setRight(removeRecursive(current.getRight(), obj));
        }
        else {
            if (current.getLeft() == null) {
                return current.getRight();
            } else if (current.getRight() == null) {
                return current.getLeft();
            }

            T smallestValue = findSmallestValue(current.getRight());
            current.setObject(smallestValue);

            current.setRight(removeRecursive(current.getRight(), smallestValue));
        }
        return current;
    }

    private T findSmallestValue(BinaryNode<T> root) {
        return root.getLeft() == null ? root.getObject() : findSmallestValue(root.getLeft());
    }
}