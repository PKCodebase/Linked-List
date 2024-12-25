package com.linked_list;


public class Cycle {
    public boolean hasCycle(Node head) {
      Node slow = head;
      Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(-4);
        head.next.next.next.next = head.next;
        Cycle linkedListCycle = new Cycle();
        boolean result = linkedListCycle.hasCycle(head);
        System.out.println(result);
    }

}
