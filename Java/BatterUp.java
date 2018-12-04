// https://open.kattis.com/problems/batterup

import java.util.Scanner;

public class BatterUp {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int bats, sum = 0, c = 0;
        double ans;
        bats = scanner.nextInt();
        for (int i = 0; i < bats; i++) {
            ans = scanner.nextInt();
            if (!(ans < 0)) {
                sum += ans;
                c++;
            }
        }
        ans = (sum * 1.0) / c;
        System.out.println(ans);
    }
}
