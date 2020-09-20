/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 *
 * Leetcode 003 --> https://leetcode.com/problems/remove-nth-node-from-end-of-list/submissions/
 * Jayden YU 2020-09-20 21:36 AEST
 *
 * 		use double cursor 
 *
 */
class Solution {
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode cur1 = head;
		ListNode cur2 = head;
		for(int i = 0; i < n; i ++) {
			cur1 = cur1.next;
		}
		if (cur1 == null) {
			return head.next;
		}
		while (cur1.next != null){
			cur1 = cur1.next;
			cur2 = cur2.next;
		}

		cur2.next = cur2.next.next;
		return head;
		
	}
}