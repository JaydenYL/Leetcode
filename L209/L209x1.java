class Solution {
	
	public static void main(String[] args){
		int[] ar = new int[]{2,3,1,2,4,3};
		Solution s = new Solution();
		s.minSubArrayLen(7, ar);
	}
	
	public int minSubArrayLen(int s, int[] nums) {
		if (nums.length == 1){
			return (nums[0] == s) ? 1 : 0;
		}
		int lf = 0;
		int rt = 0;
		int sum = nums[0];
		int min_len = nums.length+1;
		while( rt < nums.length ){
			System.out.printf("%d, %d, sum = %d\n", lf, rt, sum);
			if( sum > s) {
				if (rt == lf){
					if(rt == nums.length -1){
						break;
					}
					sum = nums[++rt];
					lf++;
				} else {
					sum -= nums[lf++];
				}
			} else if (sum < s) {
				if(rt == nums.length -1){
					break;
				}
				sum += nums[++rt];
				
			} else {
				if( min_len > rt - lf + 1 ){
					min_len = rt - lf + 1;
				}
				if (rt == nums.length -1){
					break;
				}
				
				sum += (nums[++rt] - nums[lf++]);
			}
		}
		return (min_len == nums.length+1) ? 0 : min_len;
	}
}