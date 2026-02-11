    Ques:  Multiply by 2 divide by 6.


import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            int count = 0;

            while (n != 1) {
                if (n % 6 == 0) {
                    n /= 6;
                } else {
                    n *= 2;
                }
                count++;
                if (count > 1000) break;
            }
            if (n == 1) System.out.println(count);
            else System.out.println(-1);
        }
    }
}
