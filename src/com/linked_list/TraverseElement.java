package com.linked_list;


public class TraverseElement {

        static void displayList(Node head) {
            Node currentNode = head;
            while(currentNode != null) {
                System.out.print(currentNode.data+"\t");
                currentNode=currentNode.next;
            }

            System.out.println("\n");
        }

        public static void main(String[] args) {
            Node head = new Node(10);
            head.next = new Node(20);
            head.next.next = new Node(30);
            head.next.next.next = new Node(40);
            head.next.next.next.next = new Node(50);

            displayList(head);

        }

}
