/*
    Problem: Merge Two Sorted Lists
    Algorithm:
    1. handled the cases like null pointer and selected the head in advance;
    2. run a loop by traversing all the elements one by one using pointers
    in the two list as we know that those are sorted elements we just 
    checked which is greater and changed the connections.
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode first = list1;
        ListNode second = list2;
        ListNode temp;
        ListNode head=null;
        if(first == null) {
            return second;
        }
        if(second == null) {
            return first;
        }

        if(first.val>=second.val){
            head = second;
            second=second.next;
        }else{
            head = first;
            first=first.next;
        }
        temp=head;
        while(first!=null || second!=null){
            if(first==null){
                temp.next=second;
                break;
            }else if(second==null){
                temp.next=first;
                break;
            }else if(first.val>second.val){
                temp.next=second;
                temp=temp.next;
                second=second.next;
            }else if(first.val==second.val){
                temp.next=first;
                temp=temp.next;
                first=first.next;
            }else{
                temp.next=first;
                temp=temp.next;
                first = first.next;
            }
        }
        return head;
    }
}