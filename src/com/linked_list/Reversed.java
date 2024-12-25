package com.linked_list;

public class Reversed {
        public Node reverseList(Node head) {
            if(head == null){
                return head;
            }
            Node previous = null;
            Node currentNode = head;
            Node next = currentNode.next;
            while(currentNode != null){
                currentNode.next = previous;
                previous = currentNode;
                currentNode = next;
                if(next != null){
                    next = currentNode.next;
                }
            }
            head = previous;
            return head;
        }

    public static void main(String[] args) {
            Node head = new Node(10);
            head.next = new Node(20);
            head.next.next = new Node(30);
            head.next.next.next = new Node(40);
            head.next.next.next.next = new Node(50);

            Reversed reversed = new Reversed();
            Node reversedNode = reversed.reverseList(head);

            TraverseElement.displayList(reversedNode);
    }
}
