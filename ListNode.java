 public class ListNode {
      int val;
      ListNode next;
     ListNode() {}
    ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 


class Sum2ll {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode l3 = dummy;
        int c = 0;

        while (l1 != null || l2 != null) {
            int i = (l1 != null) ? l1.val : 0;
            int j = (l2 != null) ? l2.val : 0;

            int s = i + j + c;
            c = s / 10;              // carry
            s = s % 10;              // digit

            l3.next = new ListNode();  //empty next node
            l3 = l3.next;  //target the new empty node
            l3.val=s;  //store the value at node

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (c > 0) {
            l3.next = new ListNode(c);
        }

        return dummy.next;  
    }

    public static void main(String[] args) {

        Sum2ll ll =new Sum2ll();
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(3, new ListNode(4, new ListNode(6)));
        System.out.println(ll.addTwoNumbers(l1, l2));

        
    }
}

