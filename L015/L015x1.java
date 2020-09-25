/*
491 ms	43.7 MB
https://leetcode.com/problems/3sum/submissions/


*/



class Solution {
	public List<List<Integer>> threeSum(int[] nums) {
		if (nums.length < 3) return new ArrayList<>(); // if nums less than 3 element
		Arrays.sort(nums); // sort array
		Set<List<Integer>> set = new HashSet<>();
		for (int i = 0; i < nums.length - 2; i++) {
			int j = i + 1;
			int k = nums.length - 1;
			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				if (sum == 0) set.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
				else if (sum > 0){
					k--;
					while(k >=0 && nums[k] == nums[k+1]){
						k --;
					}
				} 
				else if (sum < 0){
					j++;
					while(j < nums.length && nums[j] == nums[j-1]){
						j++;
					}
				}
			}

		}

		return new ArrayList<>(set);
	}
}