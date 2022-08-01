class Solution {
    public boolean containsDuplicate(int[] nums) {
        int i=0;
      HashSet<Integer> set=new HashSet<>();
      while(i<nums.length){
        if(!set.contain(nums[i]){
           set.add(nums[i]);
        }else
           return true;
        i++;
      }
       return false;
    }
 }
