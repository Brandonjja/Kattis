// https://open.kattis.com/problems/howmanydigits

import java.util.Scanner;

public class HowManyDigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        do {
            double ans = 0;
            int n = sc.nextInt();

            if (n != 0 && n != 1) {
                ans = 1 + 0.5 * Math.log10(2 * Math.PI * n) + n * Math.log10(n) - n * Math.log10(Math.E);
                System.out.println((int) ans);
            } else {
                System.out.println(1);
            }
        } while (sc.hasNext());

        sc.close();
    }
}
