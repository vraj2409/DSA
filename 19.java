/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null)
        {
            return null;
        }
        int s = 0;
        ListNode curr = head;
        while(curr!=null)
        {
            s++;
            curr = curr.next;
        }   
        if(n==s)
        {
            return head.next;
        }
        int is = s - n ;
        ListNode prev = head;
        int i = 1;
        while(i<is)
        {
            prev = prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
    }
}