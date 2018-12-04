// https://open.kattis.com/problems/autori

import java.util.Scanner;

public class Autori {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char c[] = str.toCharArray();
        StringBuilder sb = new StringBuilder("");
        sb.append(c[0]);
        for (int i = 1; i < c.length; i++) {
            if (c[i] == '-') {
                sb.append(c[i+1]);
            }
        }
        System.out.println(sb);
    }
}
