// Reverse Rot https://open.kattis.com/problems/reverserot

import java.util.Scanner;

public class ReverseRot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";
        while (true) {
            String line = sc.nextLine();
            String[] l = line.split(" ");
            if (l[0].equals("0")) {
                break;
            }
            int shift = Integer.parseInt(l[0]);
            char c[] = l[1].toCharArray();

            StringBuilder sb = new StringBuilder("");

            for (int i = 0; i < c.length; i++) {
                try {
                    sb.append(alpha.charAt(alpha.indexOf(c[i]) + shift));
                } catch (StringIndexOutOfBoundsException e) {
                    int again = alpha.indexOf(c[i]) + shift - 28;
                    sb.append(alpha.charAt(again));
                }
            }
            System.out.println(sb.reverse().toString());
        }
        sc.close();
    }
}
