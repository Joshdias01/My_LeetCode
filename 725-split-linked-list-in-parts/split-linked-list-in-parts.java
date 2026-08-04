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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int count=1;
        ListNode temp=head;
        ListNode[] ans=new ListNode[k];
        if(head==null) return ans;
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        int size=count/k;
        int extra=count%k;
        if(size==0){
            temp=head;
            int i=0;
            while(temp!=null){
                ListNode nextN=temp.next;
                ans[i++]=temp;
                temp.next=null;
                temp=nextN;
            }
        }else{
            temp=head;
            int curr=1;
            int maintain=size;
            int i=0;
            while(temp!=null){
                curr=1;
                if(extra!=0){
                    maintain=size+1;
                    extra--;
                }else{
                    maintain=size;
                }
                ans[i++]=temp;
                for(int j = 1; j < maintain; j++){
                    temp = temp.next;
                }
                ListNode nextN=temp.next;
                temp.next=null;
                temp=nextN;
            }
        }
        return ans;
    }
}