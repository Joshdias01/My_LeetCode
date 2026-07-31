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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp = head;
        ListNode prev=null;
        while(temp!=null && temp.next!=null){
            ListNode nextNode=temp.next.next;
            if(temp==head){
                head=temp.next;
            }
            if(prev!=null){
                prev.next=temp.next;
            }
            temp.next.next=temp;
            temp.next=nextNode;
            prev=temp;
            temp=nextNode;
        }
        return head;
    }
}