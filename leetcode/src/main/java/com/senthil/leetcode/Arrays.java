package com.senthil.leetcode;

public class Arrays {
	public int findHigherRepeat(int[] nums) {
		int max = 0, count = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 1) {
				count++;
			} else {
				max = Math.max(max, count);
				count = 0;
			}
			
		}
		return max;
	}
}
