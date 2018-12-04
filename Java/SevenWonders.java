// https://open.kattis.com/problems/sevenwonders

import java.util.Scanner;

public class SevenWonders {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int ans, t = 0, c2 = 0, g = 0;
        char c[] = a.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'T') {
                ++t;
            } else if (c[i] == 'C') {
                ++c2;
            } else {
                ++g;
            }
        }
        ans = (int) (Math.pow(t, 2) + Math.pow(c2, 2) + Math.pow(g, 2));
        ans += 7 * Math.min(Math.min(t, c2), g);
        
        System.out.println(ans);
    }
}
