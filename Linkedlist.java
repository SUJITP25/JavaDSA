
public class Linkedlist {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Print LinkedList
    public static void printLinkedList(Node head){
        Node temp = head; 
        while (temp != null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
    }

    public static void printRecursively(Node head){
        if (head == null) return; 
        System.out.println(head.data);
        printRecursively(head.next);
    }
    
    // Function go Print Reverse LinkedList Recursively
    public static void printReverseRecursively(Node head){
        if (head == null) return; 
        printReverseRecursively(head.next);
        System.out.println(head.data);
    }

    // find the length of the linkedlist 

    public static int findLengthofLinkedList(Node head){
        Node temp = head;
        int count=0; 
        while (temp != null){
           count++;
           temp = temp.next;
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        // printLinkedList(a);
        // printRecursively(a);
        // printReverseRecursively(a);
        // findLengthofLinkedList(a);

    }
}
