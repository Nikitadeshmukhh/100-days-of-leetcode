//twoSum
class Solution {
    public int[] twoSum(int[] nums, int target) {
       int[] ans = new int[2];

		// number and its corresponding index
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int index = 0; index < nums.length; index++) {

			if (!map.containsKey(nums[index])) {

				map.put(target - nums[index], index);

			} else {
				ans[0] = index;
				ans[1] = map.get(nums[index]);
				break;
			}
		}
		return ans;
    }
}
