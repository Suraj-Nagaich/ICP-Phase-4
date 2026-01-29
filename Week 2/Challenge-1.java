 Ques 1: Sum of Total Strength of Wizards

Code: 

        class Solution {
    public int totalStrength(int[] nums) {
        int n=nums.length;
       long ans=0;
        for(int i=0;i<n;i++)
        {
            int min=nums[i];
            long sum=0;
            for(int j=i;j<n;j++)
            {
                min=Math.min(min,nums[j]);
                sum+=nums[j];
                ans+=min*sum;
            }

        }
        return (int)(ans%1000000007);
        
    }
}
