/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node dummy=new Node(-1);
        Node res=dummy;
        Node temp=head;
        while(temp!=null){
            Node newNode=new Node(temp.val);
            res=newNode;
            res.next=temp.next;
            temp.next=res;
            temp=temp.next.next;
        }
        temp=head;
        while(temp!=null){
            Node newNode=temp.next;
            if(temp.random==null){
                newNode.random=null;
            }else{
                newNode.random=temp.random.next;
            }
            temp=temp.next.next;   
        }
        temp=head;
        res=dummy;
        while(temp!=null){
            res.next=temp.next;
            temp.next=temp.next.next;
            temp=temp.next;
            res=res.next;
        }
        return dummy.next;
    }
}