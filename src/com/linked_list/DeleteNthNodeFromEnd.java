//package com.linked_list;
//
//public class DeleteNthNodeFromEnd {
//    public Node removeNthFromEnd(Node head, int n) {
//        Node second = head;
//        while(n>0 && second !=null){
//            second = second.next;
//            n--;
//        }
//        if(second == null){
//            if(n>0){
//                return head;
//            }
//            if(n==0){
//                Node temp = head;
//                head = head.next;
//                temp.next = null;
//                return head;
//            }
//        }
//        Node first = head;
//        Node prev = null;
//        while(second != null){
//            prev = first;
//            first = first.next;
//            second = second.next;
//        }
//        prev.next = first.next;
//        first.next = null;
//        return head;
//
//    }
//
//    public static void main(String[] args) {
//        Node head = new Node(10);
//        head.next = new Node(20);
//        head.next.next = new Node(30);
//        head.next.next.next = new Node(40);
//        head.next.next.next.next = new Node(50);
//        head.next.next.next.next.next = new Node(60);
//
//        DeleteNthNodeFromEnd deleteNthNodeFromEnd = new DeleteNthNodeFromEnd();
//        head = deleteNthNodeFromEnd.removeNthFromEnd(head, 3);
//        }
//    }
//}
