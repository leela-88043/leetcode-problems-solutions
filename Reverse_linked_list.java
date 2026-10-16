/*
    Problem: reverse linkedlist
    Algorithm: 
    1. i have used three pointers for removing the links and assigning the
    links
    2. curr,prev,temp so that i have rearranged the links and 
    managed to return the head
*/

// Source Code:

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev=null;
        ListNode temp;
        while(curr!=null){
            temp =curr;
            curr=curr.next;
            temp.next=prev;
            prev=temp;
        }
        head=prev;
        return head;
    }
}