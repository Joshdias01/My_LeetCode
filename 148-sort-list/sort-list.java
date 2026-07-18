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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        return mergeSort(head);
    }
    ListNode mergeSort(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode mid=findMid(head);
        ListNode leftHead=head;
        ListNode rightHead=mid.next;
        mid.next=null;
        leftHead=mergeSort(leftHead);
        rightHead=mergeSort(rightHead);
        return mergeList(leftHead,rightHead);    
    }
    ListNode findMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    ListNode mergeList(ListNode head1,ListNode head2){
        if(head1==null) return head2;
        if(head2==null) return head1;
        ListNode newHead=new ListNode();
        ListNode temp=newHead;
        while(head1!=null && head2!=null){
            if(head1.val<head2.val){
                ListNode t=new ListNode(head1.val);
                temp.next=t;
                temp=temp.next;
                head1=head1.next;
            }else{
                ListNode t=new ListNode(head2.val);
                temp.next=t;
                temp=temp.next;
                head2=head2.next;
            }
        }
        while(head1!=null) {
            ListNode t=new ListNode(head1.val);
            temp.next=t;
            temp=temp.next;
            head1=head1.next;
        }
        while(head2!=null){
            ListNode t=new ListNode(head2.val);
            temp.next=t;
            temp=temp.next;
            head2=head2.next;
        }
        return newHead.next;
    }
}