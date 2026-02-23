class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        Queue<Integer>q=new LinkedList<>();
        boolean isVisited[]=new boolean[n];
        List<Integer>list=new ArrayList<>();
        q.add(0);
        while(!q.isEmpty())
        {
            int curr=q.poll();
            if(!isVisited[curr])
            {
                isVisited[curr]=true;
                list.add(curr);
                for(int ele:rooms.get(curr))
                {
                    q.add(ele);
                }
            }

        }
        for(boolean f:isVisited)
        {
            if(!f)return false;
        }
        return true;
        
    }
}
