package leetcode169;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {4,3,4,2,4,2,4,4,3,4,1};
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		FindMajorityElementFunction solution = new FindMajorityElementFunction();
		
		System.out.println("Solution: " + solution.majorityElement(nums));
	}
}
