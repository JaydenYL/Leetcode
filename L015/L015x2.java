/*
1350 ms	43.1 MB

https://leetcode.com/problems/3sum/submissions/

*/



import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		int len = nums.length;
		int cur = 1;
		int lf  = 0;
		int rt  = len-1;
		
		while(cur < len -1){
			while(lf < cur && lf >=0 && rt > cur && rt < len ){
				if(nums[lf] + nums[cur] + nums[rt] < 0){
					lf++;
					while(lf < len && nums[lf] == nums[lf-1]){
						lf++;
					}
				}else if (nums[lf] + nums[cur] + nums[rt] > 0){
					rt--;
					while(rt >=0 && nums[rt] == nums[rt+1]){
						rt--;
					}
				}else{
					boolean found = false;
					for(List<Integer> ls : res){
						if(ls.get(0) == nums[lf] && ls.get(1) == nums[cur] && ls.get(2) == nums[rt]) {
							found = true;
							break;
						}
					}
					if (!found){
						res.add(Arrays.asList(new Integer[]{nums[lf], nums[cur], nums[rt]}));
					}
					lf++;
					while(lf < len && nums[lf] == nums[lf-1]){
						lf++;
					}
					rt--;
					while(rt >= 0 && nums[rt] == nums[rt+1]){
						rt--;
					}
					
				}
			}
			cur++;
			lf = 0;
			rt = len-1;
		}
		
		return res;
	}
	
	public static int sum(int a, int b, int c){
		return a+b+c;
	}
}