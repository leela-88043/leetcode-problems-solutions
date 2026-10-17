/*
    Problem: cycle detection
    difficulty: easy
    Algorithm:
    1. we used the fast and slow pointer approach.
    2. floyd's circle detection algorithm in this we will run two pointers
    with two different speeds one pointer will catch other so that if it catches
    then definitely there is a circlular approach in the given example.
*/

// Source Code:

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class cycledetection {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}