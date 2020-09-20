/**
 * 	Leetcode 011 --> https://leetcode.com/problems/container-with-most-water/submissions/
 * 
 *  Jayden Yu , 2020-09-20 23:56 AEST
 *
 *	double pointer
*/

class Solution {
	public int maxArea(int[] height) {
		int maxi = 0;
		int lf = 0, rt = height.length - 1;
		while (lf < rt){
			maxi = Math.max(maxi, (rt - lf)*Math.min(height[lf], height[rt]));
			if(height[lf] >= height[rt]){
				rt --;
			}else{
				lf ++;
			}
		}
		return maxi;
	}
}