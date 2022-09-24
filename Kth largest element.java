//We can solve this using priority queue or by sorting algorithm
class Solution {
    public int findKthLargest(int[] nums, int k) {
     PriorityQueue<Integer>pq=new PriorityQueue<>(k+1);
        for(int i:nums)
        {
            pq.add(i);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        return pq.poll();
    }
}
//By using sorting technique
class Solution {
    public int findKthLargest(int[] nums, int k) {
         Arrays.sort(nums);
         return nums[nums.length-k];
    }
}

