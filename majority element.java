class Solution {
    public int majorityElement(int[] nums) {
       int result=0,count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(count==0)
            {result=nums[i];
             count=1;
            }
            else if(result==nums[i])
            {
                count++;
            }
            else{
                count--;
            } 
        }
        return result;
    }
}
// We can solve this question by Hashmap also.
class Solution {
    public int majorityElement(int[] nums) {
         HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        for(int i = 0; i< nums.length; i++){
            if(!map.containsKey(nums[i])) map.put(nums[i], 1);
            else map.put(nums[i], map.get(nums[i])+1);
            if( map.get(nums[i]) > nums.length/2) ans = nums[i];
        }
        return ans;
    }
}
