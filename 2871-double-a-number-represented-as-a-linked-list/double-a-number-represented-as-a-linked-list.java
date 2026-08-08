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
    public ListNode doubleIt(ListNode head) {
        int carry=doubleList(head);
        if(carry!=0){
            ListNode newNode=new ListNode(carry);
            newNode.next=head;
            return newNode;
        }
        return head;
    }
    public int doubleList(ListNode head){
        if(head==null){
            return 0;
        }
        int carry = doubleList(head.next);
        int ans=head.val;
        ans=(ans*2)+carry;
        head.val=ans%10;
        return ans/10;
    }
}