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
        
        /*
         * Duplicate Zeros
         * Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
         * Example 1:
			Input: arr = [1,0,2,3,0,4,5,0]
			Output: [1,0,0,2,3,0,0,4]
			Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
         */
        int[] nums2 = {1,0,2,3,0,4,5,0};
        int[] result = a.duplicateZeros(nums2);
        System.out.println(result);
        
        /*
         * Merge Sorted Array
         * ou are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

			Merge nums1 and nums2 into a single array sorted in non-decreasing order.
			The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
		*  Example 1:

			Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
			Output: [1,2,2,3,5,6]
			Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
			The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
         */
        int[] nums3 = {1,2,3,0,0,0};
        int[] nums4 = {2,5,6};
        int m = 3, n = 3;
        a.merge(nums3, m, nums4, n);
    }
    
}
