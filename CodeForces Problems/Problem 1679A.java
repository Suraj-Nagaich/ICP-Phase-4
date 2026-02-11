    Ques: AvtoBus


import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            if (n % 2 != 0 || n < 4) {
                System.out.println(-1);
                continue;
            }
            long min = n / 6 + (n % 6 == 0 ? 0 : 1);
            long max = n / 4;
            if (min > max) System.out.println(-1);
            else System.out.println(min + " " + max);
        }
    }
}
