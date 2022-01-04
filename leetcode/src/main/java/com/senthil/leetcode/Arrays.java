package com.senthil.leetcode;

public class Arrays {
	public int findHigherRepeat(int[] nums) {
		int max = 0, count = 0;
		for(int i : nums) {
			if(i == 1) {
				count++;
			} else {
				max = Math.max(max, count);
				count = 0;
			}
			
		}
		return Math.max(max, count);
	}
	
	public int findEvenNumDigits(int[] nums) {
//		int evenDigits = 0;
//		for(int val : nums) {
//			int digits = 0;
//			do {
//				 digits++;
//				 val = val/10;
//			} while(val != 0);
//			if(digits % 2 == 0) {
//				evenDigits++;
//			}
//		}
//		return evenDigits;
		int res = 0;
        for(var num: nums) {
            res += (int)Math.log10(num)&1;    
        }
        return res;
	}
}
