/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 *	Jayden Yu 2020-09-20 04:45 AEST
 *	Leetcode 003, use single pointer 
 */


class Solution {
	
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
		int count = 0, aim = getlength(head) - n;
		if (aim == 0){
			return head.next;
		}
		ListNode cur = head;
		while (count < aim-1){
			count++;
			cur = cur.next;
		}
		cur.next = cur.next.next;
		
		return head ;
		
	}
	
	
	public int getlength(ListNode h){
		int len = 0;
		while (h != null){
			len ++;
			h = h.next;
		}
		
		return len;
	}
	
}