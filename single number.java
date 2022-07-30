//You can follow two approach , either use xor operator from bit manipulation or use HashSet.
class Solution {
    public int singleNumber(int[] nums) {
        // int xor=0;
        // for(int num:nums){
        //     xor=xor^num;
        // }
        // return xor;
        //OR
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
                set.remove(nums[i]);
            else
                set.add(nums[i]);
        }
        return set.toArray(new Integer[1])[0];
    }
}
