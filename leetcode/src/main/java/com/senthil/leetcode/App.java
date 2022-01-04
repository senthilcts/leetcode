package com.senthil.leetcode;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*
    	 * Max Consecutive Ones
    	 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
    	 * Example 1:
			Input: nums = [1,1,0,1,1,1]
			Output: 3
			Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
    	 */
        int[] nums = {1,0,1,1,0,1};
        Arrays a = new Arrays();
        int max = a.findHigherRepeat(nums);
        System.out.println(max);
    }
    
}
