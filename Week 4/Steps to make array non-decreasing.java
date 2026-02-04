class Solution {
    public int totalSteps(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        Stack<Integer>st=new Stack<>();
        for(int i:nums)
        {
            if(st.isEmpty()||st.peek()<=i)
            {
                st.push(i);
            }
        }
        if(st.size()>=set.size())
        {
            return 0;
        }
        return set.size()-st.size();
    }

}
