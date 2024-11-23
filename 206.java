class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head==null) {
         return null;
        }
        else if(head.next==null){
            return head;
        }
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null)
        {
           ListNode nex = curr.next;
           curr.next=prev;
           prev = curr;
           curr = nex;
        }
         head.next=null;
         head = prev;
        return head;
    }
}