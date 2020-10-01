class Solution {
	
	public int minSubArrayLen(int s, int[] nums) {
		if (nums == null || nums.length == 0){
			return 0;
		}
		if (nums.length == 1){
			return (nums[0] == s) ? 1 : 0;
		}
		
		int lf = 0;
		int rt = 0;
		int sum = nums[0];
		int min_len = nums.length+1;
		while( rt < nums.length ){
			if( sum >= s) {
				min_len = Math.min(min_len, rt - lf + 1);
				if (rt == lf){
					if(rt == nums.length -1){
						break;
					}
					sum = nums[++rt];
					lf++;
				} else {
					sum -= nums[lf++];
				}
			} else  {
				if(rt == nums.length - 1){
					break;
				}
				sum += nums[++rt];
			} 
		}
		
		return (min_len == nums.length+1) ? 0 : min_len;
	}
}