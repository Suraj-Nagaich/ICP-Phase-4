class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer>q=new LinkedList<>();
        int cnt=0;
        int n=tickets.length;
        for(int i=0;i<n;i++)
        {
            if(i<=k)
            {
                cnt+=Math.min(tickets[i],tickets[k]);
            }
            else{
                cnt+=Math.min(tickets[i],tickets[k]-1);
            }
        }

        return cnt;
    }
}
