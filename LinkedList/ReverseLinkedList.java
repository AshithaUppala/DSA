/*Given the head of a singly linked list, reverse the list, and return the reversed list.
 
 Input
 ------
 1->2->3->4->5

output
-------
5->4->3->2->1

Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
*/


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
    public ListNode reverseList(ListNode head) {
        ListNode dummy=null;
        while(head !=null){
            ListNode next=head.next;
            head.next=dummy;
            dummy=head;
            head=next;

        }
        return dummy;
    }
}