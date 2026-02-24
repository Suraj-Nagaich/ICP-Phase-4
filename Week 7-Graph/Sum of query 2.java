import java.util.*;
class Solution {
    static ArrayList<Integer> querySum(int n, int arr[], int q, int queries[]) {
        int[]prefix = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefix[i]=prefix[i - 1]+arr[i - 1];
        }
        ArrayList<Integer>ans=new ArrayList<>();
        for (int i=0; i<2*q;i+=2) {
            int l = queries[i];
            int r = queries[i + 1];
            ans.add(prefix[r]-prefix[l - 1]);
        }
        return ans;
    }
}
