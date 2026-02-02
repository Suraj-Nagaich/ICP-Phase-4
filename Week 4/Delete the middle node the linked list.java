class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode prevSlow=null;
        ListNode slow=head;
        ListNode fast=head;
        if(head==null||head.next==null)return null;
        while(fast!=null&&fast.next!=null)
        {
            prevSlow=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prevSlow.next=slow.next;
        return head;   
    }
}
