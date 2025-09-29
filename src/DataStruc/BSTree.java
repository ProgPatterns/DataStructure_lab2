package DataStruc;

import java.util.ArrayList;
import java.util.List;

public class BSTree<T extends Comparable<T>> {
    Node root;

    static class Node<T> {
        T data;
        Node left;
        Node right;

        public Node(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }

    public void add(T data) {
        root = addRecursive(root, data);
    }

    private Node<T> addRecursive(Node<T> current, T data) {
        if(current == null){
            return new Node<>(data);
        }

        int comparison = data.compareTo(current.data);

        if(comparison < 0){
            current.left = addRecursive(current.left, data);
        }else if (comparison > 0){
            current.right = addRecursive(current.right, data);
        }
        return current;
    }

    public Object[] toArray(){
        List<T> elements = new ArrayList<>();
        inOrderTraversalRecursive(root, elements);
        return elements.toArray();
    }

    private void inOrderTraversalRecursive(Node<T> node, List<T> list){
        if(node != null){
            inOrderTraversalRecursive(node.left, list);
            list.add(node.data);
            inOrderTraversalRecursive(node.right, list);
        }
    }
}
