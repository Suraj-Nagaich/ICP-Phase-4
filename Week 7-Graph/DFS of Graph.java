class Solution {
    static boolean isVisited[];
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        isVisited = new boolean[n];
        ArrayList<Integer> list = new ArrayList<>();
        sol(adj, 0, list);
        return list;
    }
    public static void sol(ArrayList<ArrayList<Integer>> adj, int curr, ArrayList<Integer> list){
        if(isVisited[curr]) return;
        isVisited[curr] = true;
        list.add(curr);
        for(int i : adj.get(curr)){
            sol(adj, i, list);
        }
    }
}
