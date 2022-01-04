package com.senthil.leetcode;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ArraysTest a = new ArraysTest();
    	/*
    	 * Max Consecutive Ones
    	 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
    	 * Example 1:
			Input: nums = [1,1,0,1,1,1]
			Output: 3
			Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
    	 */
        int[] nums = {1,0,1,1,0,1};
        int max = a.findHigherRepeat(nums);
        System.out.println(max);
        
        /*
         * Find Numbers with Even Number of Digits
         * Given an array nums of integers, return how many of them contain an even number of digits.
         * Example 1:
			Input: nums = [12,345,2,6,7896]
			Output: 2
			Explanation: 
			12 contains 2 digits (even number of digits). 
			345 contains 3 digits (odd number of digits). 
			2 contains 1 digit (odd number of digits). 
			6 contains 1 digit (odd number of digits). 
			7896 contains 4 digits (even number of digits). 
			Therefore only 12 and 7896 contain an even number of digits.
         */
        int[] digits = {12,345,2,6,7896};
        int evenDigits = a.findEvenNumDigits(digits);
        System.out.println(evenDigits);
        
        /*
         *   Squares of a Sorted Array
         *   Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
         *   Example 1:
				Input: nums = [-4,-1,0,3,10]
				Output: [0,1,9,16,100]
				Explanation: After squaring, the array becomes [16,1,0,9,100].
				After sorting, it becomes [0,1,9,16,100].
         */
        int[] nums1 = {-4,-1,0,3,10};
        int[] sorted = a.sortedSquares(nums1);
        System.out.println(sorted);
    }
    
}
