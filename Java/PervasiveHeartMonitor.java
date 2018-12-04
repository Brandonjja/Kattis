// https://open.kattis.com/problems/pervasiveheartmonitor

import java.util.Scanner;

public class PervasiveHeartMonitor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int c = 0;
        double sum = 0;
        String b[];
        do {
            b = sc.nextLine().split(" ");
            for (int i = 0; i < b.length; i++) {
                try {
                    sum += Double.parseDouble(b[i]);
                    c++;
                } catch (NumberFormatException e) {
                    sb.append(b[i] + " ");
                }
            }
            System.out.println(Double.toString(sum / c) + " " + sb);
            sb.delete(0, sb.length());
            sum = 0;
            c = 0;
        } while (sc.hasNext());
        sc.close();
    }
}
