
public class BinaryTree {

    public static class Node {

        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void displayTree(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " -> ");
        if (root.left != null) {
            System.out.print(root.left.val + " -> ");
        }
        if (root.right != null) {
            System.out.print(root.right.val + " -> ");
        }
        System.out.println();
        displayTree(root.left);
        displayTree(root.right);
    }


    // Quiestion : preOrderTraversal 

    public static void preOrderTraversal(Node root){
        if (root == null) return;
        System.out.println(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }


    
    //Question : Size of The Bianry Tree
    public static int sizeOfBinaryTree(Node root){
        if (root == null) return 0;
        return 1+ sizeOfBinaryTree(root.left) + sizeOfBinaryTree(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        a.left = new Node(4);
        a.right = new Node(5);
        b.left = new Node(6);
        b.right = new Node(7);

        // displayTree(root);
        // System.out.println(sizeOfBinaryTree(root));
        preOrderTraversal(root);
    }

}
