class Solution {
    public int findKthLargest(int[] nums, int k) {
     // PriorityQueue<Integer>pq=new PriorityQueue<>(k+1);
     //    for(int i:nums)
     //    {
     //        pq.add(i);
     //        if(pq.size()>k)
     //        {
     //            pq.poll();
     //        }
     //    }
     //    return pq.poll();
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
