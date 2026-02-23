class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int n=adj.size();
       ArrayList<Integer>list=new ArrayList<>();
        boolean isVisited[]=new boolean[n];
        Queue<Integer>q=new LinkedList<>();
        q.add(0);
        while(!q.isEmpty())
        {
            int curr=q.poll();
            if(!isVisited[curr])
            {
             isVisited[curr]=true;
             list.add(curr);
             for(int ele:adj.get(curr))
             {
                 q.add(ele);
             }
            }   
        }
        return list;  
    }
}
