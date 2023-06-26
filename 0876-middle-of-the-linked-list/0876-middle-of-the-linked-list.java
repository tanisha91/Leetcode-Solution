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
    public ListNode middleNode(ListNode head) {
        ListNode tem=head;
        ListNode end=head;
        while(tem!=null&&tem.next!=null){
            tem=tem.next.next;
            end=end.next;
        }
        return end;
    }
}