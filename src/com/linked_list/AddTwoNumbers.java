package com.linked_list;
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result =new ListNode();
        ListNode ptr=result;
        int carry=0;
        while(l1!=null || l2!=null){
            int sum = carry;

            if(l1 != null)
            {
                sum+=l1.val;
                l1=l1.next;
            }

            if(l2 != null)
            {
                sum+=l2.val;
                l2=l2.next;
            }

            carry=sum/10;
            sum=sum%10;
            ptr.next=new ListNode(sum);
            ptr=ptr.next;
        }
        if(carry==1) ptr.next=new ListNode(2);
        return result.next;

    }
    public static void main(String[] args) {
        AddTwoNumbers obj = new AddTwoNumbers();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode result = obj.addTwoNumbers(l1, l2);
        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
