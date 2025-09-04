package Reverse;

public class Reverse {
    public ListNode reverseList(ListNode head){

        ListNode current = head;
        ListNode prev = null;
        while(current != null){
            ListNode  nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
    public void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Reverse reverseListObj = new Reverse();

        // Manually creating the linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(10);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original List: ");
        reverseListObj.printList(head);

        // Reverse the list
        ListNode reversedHead = reverseListObj.reverseList(head);

        System.out.print("Reversed List: ");
        reverseListObj.printList(reversedHead);
    }
}
