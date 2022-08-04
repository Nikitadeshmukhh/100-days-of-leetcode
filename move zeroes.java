class Solution {
    public void moveZeroes(int[] nums) {
         int n = nums.length;
        int i = 0, j = 0;
        while(j<n){
            if(nums[j]==0){
                j++;
            }
            else{
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j++;
            }
        }
    }
}//
