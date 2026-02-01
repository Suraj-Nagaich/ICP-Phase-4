class Solution {
    public int maxResult(int[] nums, int k) {
        ArrayDeque<Integer>  q = new ArrayDeque<>(); 
        q.add(nums[0]); 
        int curr = nums[0]; 
        for(int i=1; i<nums.length; i++)
        {
            if(i>k && q.peekFirst() == nums[i-k-1]) q.pollFirst(); 
            curr = q.peekFirst() + nums[i]; 
            nums[i] = curr; 
            while(!q.isEmpty() && q.peekLast() < curr) q.pollLast(); 
            q.add(curr); 
        }
        return nums[nums.length-1]; 
    }
}  
