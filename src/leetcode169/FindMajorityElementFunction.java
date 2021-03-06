package leetcode169;

import java.util.Arrays;

public class FindMajorityElementFunction {
	
	// Sorting, pretty fast using nlogn for array.sort
//	public int majorityElement(int[] nums) {
//		Arrays.sort(nums);
//	
//		return nums[nums.length/2];
//	}

	// Boyer-Moore Majority Vote Algorithm, O(n) time
	public int majorityElement(int[] nums) {
		// Count will be more than one for the value who appear the most
		int count = 0;
		int result = 0;

		// Going through each elements
		for (int num : nums) {
			
			// This is like the base case, but getting the last value who is equal or greater than 0
			if (count == 0) {
				result = num;
			}
			
			// decrease the count when different number, and increase for same element
			if (num != result) {
				count--;
			} else {
				count++;
			}
		}
		
		return result;
	}
	
    public int majorityElement2(int [] nums){
        int count = 1;
        
        int most = nums[0];
        
        for(int i = 1; i < nums.length; i++){
        	// When count is 0, you know current element is the majority now
        	// reset count back to 1
            if(count == 0){
                most = nums[i];
                count = 1;
                continue;
            }
            
            // Increase or decrease
            if(nums[i] == most){
                count++;
            } else {
                count--;
            }
        }
        
		return most;
    }
	
	
// Runtime ain't that great cause you check for comparing every time
//    public int majorityElement(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//        
//        int result = 0;
//        
//        for(int num : nums){
//            if(!map.containsKey(num)){
//                map.put(num,1);
//            } else{
//                map.put(num, map.get(num) + 1);
//            }
//            if(map.get(num) > nums.length/2){
//                result = num;
//                break;
//            }
//        }
//        return result;
//    }
}
