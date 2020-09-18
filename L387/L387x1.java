/**
 * Leetcode 387
 * Jayden YU, 2020-9-18 21:53 AEST 
 *
 * using hashmap:
 * Runtime: 19 ms, faster than 64.48% 
 * Memory Usage: 39.7 MB, less than 94.54% 
 *
*/

import java.util.HashMap;

class Solution {
	public int firstUniqChar(String s) {
		HashMap<Character, Integer> m  = new HashMap<Character,  Integer>();
		int len = s.length();
		char ch;
		for (int i = 0; i < len; i++){
			ch = s.charAt(i);
			if(m.containsKey(ch)){
				m.put(ch, 2);
			} else {
				m.put(ch, 1);
			}
		}
		
		for ( int i = 0; i < len;i++){
			if (m.get(s.charAt(i)) == 1 )
				return i;
		}
		return -1;
	}
}