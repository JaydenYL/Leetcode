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