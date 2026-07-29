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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null) return;
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(prev!=null){
            prev.next=null;
        }
        ListNode revHead=reverse(slow);

        ListNode temp1=head,temp2=revHead;
        int flag=0;
        while(temp1!=null && temp2!=null){
            ListNode next1=temp1.next;
            ListNode next2=temp2.next;
            if(flag==0){
                temp1.next=temp2;
                temp1=next1;
                flag=1;
            }else{
                temp2.next=temp1;
                temp2=next2;
                flag=0;
            }
        }
    }
    ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}