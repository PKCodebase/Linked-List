//package com.linked_list;
//
//public class DeleteLastNode {
//    // Node class to represent each element in the linked list
//    class Node {
//        int data;
//        Node next;
//
//        // Constructor to create a new node
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    class LinkedList {
//        Node head;  // Head of the list
//
//        // Method to delete the last node
//        public void deleteLastNode() {
//            // If the list is empty
//            if (head == null) {
//                System.out.println("The list is empty. No node to delete.");
//                return;
//            }
//
//            // If the list has only one node
//            if (head.next == null) {
//                head = null;
//                return;
//            }
//
//            // Traverse the list to find the second-to-last node
//            Node current = head;
//            while (current.next != null && current.next.next != null) {
//                current = current.next;
//            }
//
//            // current is now the second-to-last node, set its next to null
//            current.next = null;
//        }
//
//        // Method to print the list
//        public void printList() {
//            Node current = head;
//            while (current != null) {
//                System.out.print(current.data + " -> ");
//                current = current.next;
//            }
//            System.out.println("null");
//        }
//
//        // Main method to test the program
//        public static void main(String[] args) {
//            LinkedList list = new LinkedList();
//
//            // Creating a linked list: 10 -> 20 -> 30 -> null
//            list.head = new Node(10);
//            list.head.next = new Node(20);
//            list.head.next.next = new Node(30);
//
//            System.out.println("Original List:");
//            list.printList();
//
//            // Deleting the last node
//            list.deleteLastNode();
//            System.out.println("List after deleting the last node:");
//            list.printList();
//
//            // Deleting the last node again
//            list.deleteLastNode();
//            System.out.println("List after deleting the last node again:");
//            list.printList();
//
//            // Deleting the last node when only one node is left
//            list.deleteLastNode();
//            System.out.println("List after deleting the last node when only one node is left:");
//            list.printList();
//        }
//    }
//
//}
