class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
	public ListNode reverseKGroup(ListNode head, int k) {
		int len  = 0;
		ListNode cur = head, new_head = null;
		while(cur!=null){
			cur =cur.next;
			len++;
		}
		int i = 0;
		ListNode[] tmp = new ListNode[2];
		while  (i < len/k){
			if(i == 0){
				tmp = partReverse(head, k, null);
				new_head = tmp[0];
			}else {
				tmp = partReverse(cur.next, k, cur);
			}
			cur = tmp[1];
			i++;
		}
		return new_head;
		
	}
	
	public ListNode[] partReverse(ListNode head, int k, ListNode pre){
		ListNode[] res = new ListNode[2];
		res[1] = head; // the previous  head is  new tail of the
		ListNode[] ls = new ListNode[3];
		ls[0] = pre;
		ls[1] = head;
		ls[2] = head.next;
		int i = 0;
		while (i < k){
			ls[2] = ls[1].next;
			ls[1].next = ls[0];
			ls[0] = ls[1];
			ls[1] = ls[2];
			i ++;
		}
		res[1].next = ls[1];
		if (pre != null){
			pre.next = ls[0];
		}
		res[0] = ls[0]; // partial tail is the one pervious cursor , so cursor should be the begining of the next reverse  operation.
		return res;
	}
	
	
	public static void main(String[] args){
		ListNode n5 = new ListNode(5, null);
		ListNode n4 = new ListNode(4, n5 );
		ListNode n3 = new ListNode(3, n4 );
		ListNode n2 = new ListNode(2, n3 );
		ListNode n1 = new ListNode(1, n2 );
		ListNode n0 = new ListNode(0, n1 );
		Solution sl = new Solution();
//		ListNode[] ls = sl.partReverse(n0, 3);
//		ListNode hd = ls[0], tal = ls[1], cur = hd;
		ListNode hd = sl.reverseKGroup(n0, 2);
		ListNode cur  = hd;
		while(cur != null){
			System.out.println(cur.val);
			cur = cur.next;
		}

	}
}