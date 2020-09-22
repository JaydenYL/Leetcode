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
		ListNode cur = head;
		while(cur!=null){
			cur =cur.next;
			len++;
		}
		int i = 0;
		ListNode[] tmp = new ListNode[2];
		while  (i < len/k){
			if(i == 0){
				tmp = partReverse(head, k);
				head = tmp[0];
				cur = 
			}if(i ==1){
				cur = partReverse(head.next, k);
			}
		}
		
	}
	
	public ListNode[] partReverse(ListNode head, int k){
		ListNode[] res = new ListNode[2];
		res[1] = head;
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
		res[0] = ls[0];
		return res;
	}
	
	
	public static void main(String[] args){
		ListNode n3 = new ListNode(3, null);
		ListNode n2 = new ListNode(2, n3 );
		ListNode n1 = new ListNode(1, n2 );
		ListNode n0 = new ListNode(0, n1 );
		Solution sl = new Solution();
		ListNode[] ls = sl.partReverse(n0, 4);
		ListNode hd = ls[0], tal = ls[1], cur = hd;
		while(cur != null){
			System.out.println(cur.val);
			cur = cur.next;
		}

	}
}