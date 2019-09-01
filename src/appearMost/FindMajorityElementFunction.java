package appearMost;

public class FindMajorityElementFunction {
	// Sorting
	// public int majorityElement(int[] nums) {
	// Arrays.sort(nums);

	// return nums[nums.length/2];
	// }

	// Boyer-Moore Majority Vote Algorithm
	public int majorityElement(int[] nums) {
		int count = 0, result = 0;

		for (int num : nums) {
			if (count == 0) {
				result = num;
			}
			if (num != result) {
				count--;
			} else {
				count++;
			}
		}
		return result;
	}
}
