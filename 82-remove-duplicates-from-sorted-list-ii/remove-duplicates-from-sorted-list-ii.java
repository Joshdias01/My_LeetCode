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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev=null;
        ListNode temp=head;
        ListNode curr=head;
        if(head==null || head.next==null) return head;
        while(temp!=null){
            while(temp!=null && curr.val==temp.val){
                temp=temp.next;
            }
            if(curr.next==temp){
                prev=curr;
                curr=temp;
            }else{
                if(curr==head){
                    head=temp;
                }else{
                    prev.next=temp;
                }
                curr=temp;
            }
        }
        return head;
    }
}