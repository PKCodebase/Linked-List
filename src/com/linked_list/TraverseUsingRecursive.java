package com.linked_list;


public class TraverseUsingRecursive {

    private static void displayValue(Node head) {
        if(head == null){
            return ;
        }
        System.out.println(head.data);
        displayValue(head.next);

        System.out.print(" ");
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        
        displayValue(head);
    }


}
