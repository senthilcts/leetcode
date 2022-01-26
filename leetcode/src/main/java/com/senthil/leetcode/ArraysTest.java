package com.senthil.leetcode;
import java.util.*;
public class ArraysTest {
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
	
	public int[] findAquares(int[] nums) {
		
		for(int i = 0 ; i < nums.length; i++) {
			nums[i] = nums[i] * nums[i];
		}
		Arrays.sort(nums);
		return nums;
	}
	public int[] sortedSquares(int[] nums) {
        int[] results = new int[nums.length];
        int i =0;
        int j =nums.length-1;
        int k =nums.length-1;
        
        while(i<=j){
            int leftsq = nums[i] * nums[i];
            int rightsq = nums[j] * nums[j];
            
            if(leftsq<rightsq){
                results[k--] = rightsq;
                j--;
            }
            else{
                results[k--] = leftsq;
                i++;
            }
        }
        return results;
    }
	public int[] duplicateZeros(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 0) {
				for(int j = nums.length - 1; j > i; j--) {
					nums[j] = nums[j-1];
				}
				i++;
			}
		}
		return nums;
	}
	
	public void duplicateZerosES(int[] arr) {
        int zeroCount = 0;
        int length = arr.length-1;
        for(int i = 0; i <= length - zeroCount; i++) {
            if(arr[i] == 0) {
                if(i == length - zeroCount){
                    arr[length] = 0;
                    length -= 1;
                    break;
                }
                zeroCount++;
            }
        }
        
        int last = length - zeroCount;
        
        for(int i = last; i >= 0; i--) {
            if(arr[i] == 0) {
                arr[i + zeroCount] = 0;
                zeroCount--;
                arr[i + zeroCount] = 0;
            } else {
                arr[i + zeroCount] = arr[i];
            }
        }
        
        
    }
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i < n; i++) {
        	nums1[i+m] = nums2[i];
        }
        Arrays.sort(nums1);
    }
	
	/*
	 * Remove Element
	 * Input: nums = [3,2,2,3], val = 3
		Output: 2, nums = [2,2,_,_]
		Explanation: Your function should return k = 2, with the first two elements of nums being 2.
		It does not matter what you leave beyond the returned k (hence they are underscores).
	 */
	
	public int removeElement(int[] nums, int val) {
		int count = 0;
		for(int j = 0; j < nums.length; j++) {
			if(nums[j] != val) {
				nums[count] = nums[j];
				count++;
			}
		}
        return count;
    }
	public int removeDuplicates(int[] nums) {
		if (nums.length == 0) return 0;
	    int i = 0;
	    for (int j = 1; j < nums.length; j++) {
	        if (nums[j] != nums[i]) {
	            i++;
	            nums[i] = nums[j];
	        }
	    }
	    return i + 1;
    }
	/*
	 *  Replace Elements with Greatest Element on Right Side
	 *  Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array.

 

Example 1:

Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]
Explanation: 
- index 0 --> the greatest element to the right of index 0 is index 1 (18).
- index 1 --> the greatest element to the right of index 1 is index 4 (6).
- index 2 --> the greatest element to the right of index 2 is index 4 (6).
- index 3 --> the greatest element to the right of index 3 is index 4 (6).
- index 4 --> the greatest element to the right of index 4 is index 5 (1).
- index 5 --> there are no elements to the right of index 5, so we put -1.
	 */
	public int[] replaceElements(int[] arr) {
		int size = arr.length;
		 
        // Initialize the next greatest element
        int max_from_right =  arr[size-1];
 
        // The next greatest element for the rightmost
        // element is always -1
        arr[size-1] = -1;
 
        // Replace all other elements with the next greatest
        for (int i = size-2; i >= 0; i--)
        {
            // Store the current element (needed later for
            // updating the next greatest element)
            int temp = arr[i];
 
            // Replace current element with the next greatest
            arr[i] = max_from_right;
 
            // Update the greatest element, if needed
            if(max_from_right < temp)
            max_from_right = temp;
        }
        return arr;
    }
	/*
	 * Sort Array By Parity
	 * Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.

 

Example 1:

Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
Example 2:

Input: nums = [0]
Output: [0]
	 */
	public int[] sortArrayByParity(int[] A) {
		int[] ans = new int[A.length];
        int t = 0;

        for (int i = 0; i < A.length; ++i)
            if (A[i] % 2 == 0)
                ans[t++] = A[i];

        for (int i = 0; i < A.length; ++i)
            if (A[i] % 2 == 1)
                ans[t++] = A[i];

        return ans;
        
    }
}
