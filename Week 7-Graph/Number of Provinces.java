class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int res = 0;
        for (int i = 0; i < n; i++){
            if (!visited[i]){
                dfs(i, isConnected, visited);
                res++;
            }
        }
        return res;
    }
    private void dfs(int i, int[][] isConnected, boolean[] visited){
        visited[i] = true;
        for (int j = 0; j < isConnected.length; j++){
            if (!visited[j] && isConnected[i][j] == 1){
                dfs(j, isConnected, visited);
            }
        }
    }
}
