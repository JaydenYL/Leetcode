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
 *	Leetcode 61  -->  https://leetcode.com/problems/rotate-list/
 * 	Jayden Yu 	 --	  2020-09-22 01:10 AEST
 *
 */

class Solution {
	public ListNode rotateRight(ListNode head, int k) {
		if (k == 0 || head == null){
			return head;
		}
		int len = 1;
		ListNode pre_tail = head;
		while (pre_tail.next != null){
			pre_tail = pre_tail.next;
			len ++;
		}
		int idx = len - k%len; // the index of new head node
		if (idx == 0){
			return head;
		}
		ListNode new_tail = head, pre_head = head, new_head;
		for(int i = 0; i < idx-1 ; i++){ 
			new_tail = new_tail.next;
			
		}
		
		pre_tail.next = pre_head;
		new_head = new_tail.next;
		new_tail.next = null;
		return new_head;
		
	} 
}