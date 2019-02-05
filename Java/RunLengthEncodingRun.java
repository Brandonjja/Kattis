// Run-Length Encoding, Run! https://open.kattis.com/problems/runlengthencodingrun

import java.util.Scanner;

public class RunLengthEncodingRun {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String line[] = sc.nextLine().split(" ");
        sc.close();
        if (line[0].equals("E")) {
            char c[] = line[1].toCharArray();
            char prev = c[0];
            int ctr = 1;
            for (int i = 1; i < c.length; i++) {
                if (c[i] == prev) {
                    ctr++;
                } else {
                    System.out.print(prev + "" + ctr);
                    prev = c[i];
                    ctr = 1;
                }
            }
            System.out.print(prev + "" + ctr);
        } else {
            char c[] = line[1].toCharArray();
            char l;
            int n;
            for (int i = 0; i < c.length; i += 2) {
                l = c[i];
                n = Integer.parseInt(String.valueOf(c[i + 1]));
                for (int j = 0; j < n; j++) {
                    System.out.print(l);
                }
            }
        }
    }
}
