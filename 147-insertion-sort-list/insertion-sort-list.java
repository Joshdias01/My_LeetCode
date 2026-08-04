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
    public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode dummy=new ListNode(Integer.MIN_VALUE);
        ListNode temp=head;
        while(temp!=null){
            ListNode nextNode=temp.next;
            replaceNode(dummy,temp);
            temp=nextNode;
        }
        return dummy.next; 
    }
    void replaceNode(ListNode head,ListNode newNode){
        ListNode temp=head.next;
        ListNode prev=head;
        if(temp==null){
            head.next=newNode;
            newNode.next=null;
            return;
        }
        while(temp!=null){
            if(temp.val>=newNode.val){
                prev.next=newNode;
                newNode.next=temp;
                return;
            }
            prev=temp;
            temp=temp.next;
        }
        prev.next=newNode;
        newNode.next=temp;
    }
}