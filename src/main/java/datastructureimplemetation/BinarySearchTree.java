package datastructureimplemetation;

public class BinarySearchTree {

    class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public boolean find(int input) {
        Node current = root;
        while (current != null) {
            if(current.data == input) {
                return true;
            } else if (current.data > input ) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    public void insert(int input) {
        Node newNode = new Node(input);

        if(root==null) {
            root = newNode;
            return;
        }

        Node current = root;
        Node parent = null;

        while (true) {
            parent = current;
            if(current.data > input) {
                current = current.left;

            }
        }
    }

}
