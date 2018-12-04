// https://open.kattis.com/problems/trik

import java.util.Scanner;

public class Trik {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int c = 1;
        String s = scanner.nextLine();
        char data[] = s.toCharArray();

        for (int i = 0; i < data.length; i++) {
            if (data[i] == 'A' && c == 1) {
                c = 2;
            } else if (data[i] == 'A' && c == 2) {
                c = 1;
            } else if (data[i] == 'B' && c == 2) {
                c = 3;
            } else if (data[i] == 'B' && c == 3) {
                c = 2;
            } else if (data[i] == 'C' && c == 3) {
                c = 1;
            } else if (data[i] == 'C' && c == 1) {
                c = 3;
            }
        }
        System.out.println(c);
    }
}
