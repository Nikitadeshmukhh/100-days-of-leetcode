class Solution {
    public int trap(int[] height) {
        int leftMax = 0, rightMax = 0;
    int res = 0;
    int size = height.length;
    int left = 0;
    int right = size - 1;
    
    while(left < right){
        leftMax = Math.max(leftMax, height[left]);
        rightMax = Math.max(rightMax, height[right]);
        
        if(leftMax < rightMax){
            res += leftMax - height[left];
            left++;
        }else{
            res += rightMax - height[right];
            right--;
        }
    }
    return res;
    }
}
