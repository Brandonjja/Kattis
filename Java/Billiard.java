// https://open.kattis.com/problems/billiard

import java.util.Scanner;

public class Billiard {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double a, b, s, m, n, A, v;
        do {
            a = scanner.nextInt();
            b = scanner.nextInt();
            s = scanner.nextInt();
            m = scanner.nextInt();
            n = scanner.nextInt();

            if (a == 0 && b == 0 && s == 0 && m == 0 && n == 0) {
                break;
            }

            double x = a * m;
            double y = b * n;
            
            A = Math.toDegrees(Math.atan(y / x));
            double dis = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
            
            v = (dis / s);
            System.out.printf("%.2f %.2f\n", A, v);
        } while (true);
        scanner.close();
    }
}
