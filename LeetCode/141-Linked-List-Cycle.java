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
 
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        // Initialize slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;

        // Traverse the list
        while (fast != null && fast.next != null) {
            slow = slow.next;          // Move slow by 1 step
            fast = fast.next.next;     // Move fast by 2 steps

            // If slow and fast meet, a cycle exists
            if (slow == fast) {
                return true;
            }
        }

        // If fast reaches null, no cycle exists
        return false;
    }
}