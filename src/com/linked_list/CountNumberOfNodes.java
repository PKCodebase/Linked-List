package com.linked_list;

public class CountNumberOfNodes {

    static int noOfNodes(Node head){
        int count = 0;
        Node currNode = head;
        while(currNode != null){
            count++;
            currNode = currNode.next;
        }
        return count;

    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        int result = noOfNodes(head);
        System.out.println(result);

    }
}
