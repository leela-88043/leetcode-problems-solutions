/*
    Problem: intersection of two linked lists
    Algorithm:
    1.by brute force we have developed two loops so that we can find the 
    intersection part
    2nd algorithm:
    1. we will travel the list one by one element when we reach the null
    we will just exchange the paths so that when we get the equal addresses
    we will return the address of the intersected part
*/

// Source Code:

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class intersection_of_two_linkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode first = headA;
        ListNode second;
        while(first!=null){
            second=headB;
            while(second!=null){
                if(first==second){
                    return first;
                }
                second=second.next;
            }
            first=first.next;
        }
        return null;
    }
}

/*
    second approach:

    public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode first = headA;
            ListNode second=headB;

            while(first != second) {
                first = (first == null) ? headB : first.next;
                second = (second == null) ? headA : second.next;
            }
            return first;
        }
    }
*/