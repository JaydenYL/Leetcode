/**
 * leetcode 387 . solution 2
 * Jayden Yu, 2020-09-18 22:00 AEST
 *
 * using array rather than hashmap:
 *
 * Runtime: 6 ms, faster than 91.44%  
 * Memory Usage: 39.9 MB, less than 81.45%
 */

class Solution {
	public int firstUniqChar(String s) {
		int [] arr = new int[127];
		int len = s.length();
		for ( int i = 0; i < len;i++){
			arr[s.charAt(i)] ++;
		}
		for (int i = 0; i < len; i++){
			if (arr[s.charAt(i)] == 1 ){
				return i;
			}
		}
		return -1;
	}
}