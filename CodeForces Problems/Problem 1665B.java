     QUes:  Array Cloning technique


import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            int maxFreq = 0;
            for (int x : a) {
                map.put(x, map.getOrDefault(x, 0) + 1);
                maxFreq = Math.max(maxFreq, map.get(x));
            }
            int ops = 0;
            int curr = maxFreq;
            while (curr < n) {
                int add = Math.min(curr, n - curr);
                curr += add;
                ops++;
            }
            ops += (n - maxFreq);
            System.out.println(ops);
        }
    }
}
