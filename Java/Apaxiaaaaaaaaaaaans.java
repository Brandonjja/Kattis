// https://open.kattis.com/problems/apaxiaaans

import java.util.Scanner;

public class Apaxiaans {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        char c[] = a.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < c.length; i++) {
            try {
                if (c[i] != c[i + 1]) {
                    sb.append(c[i]);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                sb.append(c[i]);
                break;
            }
        }
        System.out.println(sb);
    }
}
