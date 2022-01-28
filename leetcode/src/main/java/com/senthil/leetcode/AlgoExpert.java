package com.senthil.leetcode;

import java.util.ArrayList;
import java.util.List;

public class AlgoExpert {
	public static int findClosestValueInBst(BST tree, int target) {
		// Write your code here.
		BST temp = tree;
		int closest = tree.value;

		while(temp != null) {
			if(Math.abs(target - closest) > Math.abs(target - temp.value)) {
				closest = temp.value;
			}
			if(target > temp.value && temp.right != null) {
				temp = temp.right;
			}
			else if(target < temp.value && temp.left != null) {
				temp = temp.left;
			} else {
				return closest;
			}

		}
		return closest;
	}

	static class BST {
		public int value;
		public BST left;
		public BST right;

		public BST(int value) {
			this.value = value;
		}
	}

	public static class BinaryTree {
		int value;
		BinaryTree left;
		BinaryTree right;

		BinaryTree(int value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}
	}
	
	public static void calculateBranchSums(BinaryTree node, int runningSum, List<Integer> sums) {
		if(node == null) {
			return;
		}
		int newRunningSum = runningSum + node.value;
		if(node.left == null & node.right == null) {
			sums.add(newRunningSum);
		}
		calculateBranchSums(node.left, newRunningSum, sums);
		calculateBranchSums(node.right, newRunningSum, sums);
		
	}
	public static List<Integer> branchSums(BinaryTree root) {
		// Write your code here.
		List<Integer> sums = new ArrayList<Integer>();
		calculateBranchSums(root, 0, sums);
		return sums;
	}
}
