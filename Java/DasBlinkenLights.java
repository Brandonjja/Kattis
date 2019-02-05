// Das Blinkenlights https://open.kattis.com/problems/dasblinkenlights

import java.util.Scanner;

public class DasBlinkenlights {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int s = sc.nextInt();
        int p2 = p;
        int q2 = q;
        sc.close();
        while (true) {
            if (p2 == q2) {
                if (p2 <= s) {
                    System.out.println("yes");
                    break;
                } else {
                    System.out.println("no");
                    break;
                }
            } else if (p2 > q2) {
                q2 += q;
            } else {
                p2 += p;
            }
        }
    }
}
