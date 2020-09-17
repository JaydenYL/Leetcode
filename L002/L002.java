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
// Leetcode 002
// Jayden Yu , 2020-09-18 03:45 AEST

class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int num = l1.val + l2.val;
		ListNode head = new ListNode(num%10);
		ListNode cur = head;
		num /= 10;
		ListNode cur1 = l1.next;
		ListNode cur2 = l2.next;
		ListNode tmp;
		while (cur1 != null || cur2 != null || num != 0){
			if (cur1 == null && cur2 != null){
				tmp  = new ListNode((cur2.val+num)%10);
				num  = (cur2.val + num)/10;
				cur2 =cur2.next;
			}else if (cur1 !=null && cur2 == null){
				tmp  = new ListNode((cur1.val+num)%10);
				num  = (cur1.val + num)/10;
				cur1  = cur1.next;
			} else if (cur1 != null && cur2 != null){
				tmp = new ListNode((cur1.val+cur2.val+num)%10);
				num = (cur1.val+cur2.val+num)/10 ;
				cur1 = cur1.next;
				cur2 = cur2.next;
			} else{
				tmp = new ListNode(num);
				num /= 10;
			}
			cur.next = tmp;
			cur = tmp;
			
		}
		return head;
	}
}