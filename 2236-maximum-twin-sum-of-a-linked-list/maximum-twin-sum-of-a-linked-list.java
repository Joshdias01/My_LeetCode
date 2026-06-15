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
    public int pairSum(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        int max=0;
        for(int i=0;i<list.size();i++){
            int sum=0;
            sum=(list.get(i)+list.get(list.size()-i-1));
            max=Math.max(max,sum);
        }
        return max;
    }
}