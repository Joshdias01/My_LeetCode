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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy=head;
        ListNode temp=head.next;
        while(temp!=null){
            if(temp.val==0 && temp.next==null){
                dummy.next=null;
                return head;
            }
            else if(temp.val==0){
                dummy.next=temp;
                dummy=dummy.next;
            }else{
                dummy.val+=temp.val;
            }
            temp=temp.next;
        }
        return head;
    }
}