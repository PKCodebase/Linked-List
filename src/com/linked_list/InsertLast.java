package com.linked_list;

public class InsertLast {
    private static Node insertLast(Node head, int data) {
        Node temp = new Node(data);
        temp.next = head;
        return temp;
    }  static void displayList(Node head) {
        Node currentNode = head;
        while(currentNode != null) {
            System.out.print(currentNode.data+"\t");
            currentNode=currentNode.next;
        }

        System.out.println("\n");
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertLast(head, 10);
        head = insertLast(head, 20);
        head = insertLast(head, 30);
        head = insertLast(head, 40);
        //System.out.println(head);

        displayList(head);
    }

}
