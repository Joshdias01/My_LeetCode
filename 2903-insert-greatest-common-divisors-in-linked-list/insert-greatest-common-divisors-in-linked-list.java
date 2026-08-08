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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp=head;
        ListNode prev=temp;
        temp=temp.next;
        while(temp!=null){
            int ans=gcd(prev.val,temp.val);
            ListNode newNode=new ListNode(ans);
            prev.next=newNode;
            newNode.next=temp;
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
    int gcd(int a,int b){
        while(a!=0 && b!=0){
            if(a>b){
                a=a%b;
            }else{
                b=b%a;
            }
        }
        if(a==0) return b;
        return a;
    }
}