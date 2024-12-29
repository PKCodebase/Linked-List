package com.linked_list;

public class DeleteFirstNodes {

    private static Node deleteFirstNode(Node head) {
        if (head == null) return null;
        return head.next;
    }
    private static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Original List:");
        printList(head);

        head = deleteFirstNode(head);
        System.out.println("\nAfter deleting first node:");
        printList(head);

        head = deleteFirstNode(head);
        System.out.println("\nAfter deleting another first node:");
        printList(head);
    }
}


