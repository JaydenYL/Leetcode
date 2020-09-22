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
 *  LeetCode 206 --> https://leetcode.com/problems/reverse-linked-list/
 *  Jayden Yu 2020-09-23 04:32 AEST
 *
 */

class Solution {
	
	public ListNode reverseList(ListNode head) {
		if (head == null){
			return null;
		}
		ListNode pre = null;
		ListNode cur = head;
		ListNode nxt = head.next;
		while (cur != null){
			cur.next = pre;
			pre = cur;
			cur = nxt;
			if (nxt != null){
				nxt = nxt.next;
			}
		}
		return pre;
	}
	
}