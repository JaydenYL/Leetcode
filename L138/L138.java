/*
// Definition for a Node.
class Node {
	int val;
	Node next;
	Node random;

	public Node(int val) {
		this.val = val;
		this.next = null;
		this.random = null;
	}
}
*/
import java.util.HashMap;

class Solution {
	public Node copyRandomList(Node head) {
		if ( head == null )
			return null;
		HashMap<Node,Node> copymap = new HashMap<Node, Node>();
		Node hd = new Node(head.val);
		Node cur = head;
		Node copycur = hd;
		
		Node tem_next = null;
		Node tem_rand = null;
		
		copymap.put(head, hd);
		copymap.put(null, null);
		// if(!copymap.containsKey(cur.next)){
		//     tem_next = new Node(cur.next.val);   
		//     copycur.next = tem_next;
		//     copymap.put(cur.next, copycur.next);
		// }
		// if(!copymap.containsKey(cur.random)){
		//     tem_rand = new Node(cur.random.val);
		//     copycur.random = tem_rand;
		//     copymap.put(cur.random, copycur.random);
		// }
		// cur = cur.next;
		// copycur = copycur.next;
		
		while(cur != null ){
			if (copymap.containsKey(cur.next)){
				tem_next = copymap.get(cur.next);
			}  else {
				tem_next = new Node(cur.next.val);
				copymap.put(cur.next, tem_next);
			}   
			copycur.next = tem_next;
			
			
			if(copymap.containsKey(cur.random)){
				tem_rand = copymap.get(cur.random);
			} else {
				tem_rand = new Node(cur.random.val);
				copymap.put(cur.random, tem_rand);
			}
			copycur.next = tem_next;
			copycur.random = tem_rand;
			
			cur = cur.next;
			copycur = copycur.next;
		}
		
		return hd;
	}
}