/*
    problem: Remove nth node from the linked list
    Algorithm: 
    1. we have to remove the element from the end so we use two
    pointers approach.
    2. first we will move the fast pointer and slow pointer one by one
    first separating firstly with the n elements
    3. next we have to handle the edge case like fast pointer if it becomes
    null we have to return the first but one node address so that we can
    remove the first element. 
*/

// Source Code:

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if(fast==null){
            return head.next;
        }else{
            while(fast!=null && fast.next!=null){
                fast=fast.next;
                slow=slow.next;
            }
            temp =slow.next.next;
            slow.next=temp;
        }
        return head;
    }
}