// https://open.kattis.com/problems/mixedfractions

import java.util.Scanner;

public class MixedFractions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b, count = 0;
        do {
            a = sc.nextInt();
            b = sc.nextInt();
            if (a == 0 && b == 0) {
                break;
            }
            while (b <= a) {
                count++;
                a -= b;
            }
            System.out.println(count + " " + a + " / " + b);
            count = 0;
        } while (sc.hasNext());
        sc.close();
    }
}
