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
}
