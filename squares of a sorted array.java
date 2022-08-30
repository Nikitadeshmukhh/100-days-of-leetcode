class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];
        int start=0;
        int end=n-1;
        int i=n-1;
        while(i>=0)
        {
            if(nums[start]*nums[start]>nums[end]*nums[end])
            { res[i--]=nums[start]*nums[start];
              start++;
            }   
            else{
                res[i--]=nums[end]*nums[end];
                end--;
            }
        }
        return res;
    }
}
