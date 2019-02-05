// Secret Message https://open.kattis.com/problems/secretmessage

import java.util.Scanner;

public class SecretMessage {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            StringBuilder sb = new StringBuilder(line);
            while (Math.ceil(Math.sqrt(sb.length())) != (int) Math.sqrt(sb.length())) {
                sb.append("*");
            }
            int sq = (int) Math.sqrt(sb.length());
            char c[] = sb.toString().toCharArray();
            int rowSub = sq;
            int j = c.length;
            j -= sq;

            while (true) {
                try {
                    if (c[j] == '*') {
                        j -= sq;
                        continue;
                    } else {
                        System.out.print(c[j]);
                        j -= sq;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    if (rowSub == -1) {
                        break;
                    }
                    j = c.length;
                    rowSub -= 1;
                    j -= rowSub;
                    continue;
                }
            }

            System.out.println();
        }
        sc.close();
    }
}
