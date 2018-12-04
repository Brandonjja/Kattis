// https://open.kattis.com/problems/savingdaylight

import java.util.Scanner;

public class SavingDaylight {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = " ";
        do {
            String data[] = sc.nextLine().split(" ");
            String t1[] = data[3].split(":");
            String t2[] = data[4].split(":");
            int h1 = Integer.parseInt(t1[0]);
            int m1 = Integer.parseInt(t1[1]);
            int h2 = Integer.parseInt(t2[0]);
            int m2 = Integer.parseInt(t2[1]);

            h2 -= h1;
            if (h2 < 0) {
                h2 += 24;
            }

            m2 -= m1;
            if (m2 < 0) {
                m2 += 60;
                if (h2 < 1) {
                    h2 = 23;
                    continue;
                }
                h2 -= 1;
            }
            System.out.println(data[0] + s + data[1] + s + data[2] + s + h2 + " hours " + m2 + " minutes");
        } while (sc.hasNext());
        sc.close();
    }
}
