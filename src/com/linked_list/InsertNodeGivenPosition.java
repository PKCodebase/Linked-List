package com.linked_list;

public class InsertNodeGivenPosition {
    static Node insert(Node headNode,int position,int data){
        Node temp = new Node(data);
        if(position ==1){
            temp.next = headNode;
            return temp;
        }

        Node currentNode = headNode;
        for(int i =1;i<=position-2 && currentNode != null;i++){
            currentNode = currentNode.next;
        }
        if(currentNode == null){
            return headNode;

        }
        temp.next = currentNode.next;
        currentNode.next = temp;

        return headNode;
    }

        static void displayList(Node headNode) {
            Node currentNode = headNode;
            while(currentNode != null) {
                System.out.print(currentNode.data+"\t");
                currentNode=currentNode.next;
            }

            System.out.println("\n");
        }
        static Node insertLast(Node headNode,int data) {

            Node temp = new Node(data);
            if (headNode == null) {
                return temp;
            }
            Node currentNode = headNode;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = temp;

            return headNode;
        }
        public static void main(String[] args) {
            Node head = null;
            head = insertLast(head, 10);
            head = insertLast(head, 20);
            head = insertLast(head, 30);
            head = insertLast(head, 40);
            //System.out.println(head);

            displayList(head);

            head = insert(head, 3, 25);
            displayList(head);
        }
}
