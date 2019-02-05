// Busy Schedule https://open.kattis.com/problems/busyschedule

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BusySchedule {

    public static void print(char c[], int w, int a) {
        c = String.valueOf(a).toCharArray();
        if (c.length == 4) {
            System.out.print(c[c.length - 4]);
        }
        System.out.print(c[c.length - 3]);
        System.out.print(":");
        System.out.print(c[c.length - 2]);
        System.out.print(c[c.length - 1]);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            sc.nextLine();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String line = sc.nextLine();
                int h = Integer.parseInt(line.split(":")[0]);
                int m = Integer.parseInt(line.split(":")[1].split(" ")[0]);
                String ampm = line.split(" ")[1];
                if (h == 12 && ampm.equals("a.m.")) {
                    list.add(m);
                } else if (h == 12 && ampm.equals("p.m.")) {
                    list.add(h * 100 + m);
                } else if (line.split(" ")[1].equals("p.m.")) {
                    int pm = Integer.parseInt(line.split(":")[0] + line.split(":")[1].split(" ")[0]) + 1200;
                    list.add(pm);
                } else {
                    list.add(Integer.parseInt(line.split(":")[0] + line.split(":")[1].split(" ")[0]));
                }
            }
            Collections.sort(list);
            for (int w : list) {
                char c[] = String.valueOf(w).toCharArray();
                int a;
                if (w < 100) {
                    a = w + 1200;
                    c = String.valueOf(a).toCharArray();
                    print(c, w, a);
                    System.out.print(" a.m.\n");
                } else if (w > 1259) {
                    a = w - 1200;
                    c = String.valueOf(a).toCharArray();
                    print(c, w, a);
                    System.out.print(" p.m.\n");
                } else if (w <= 1259 && w >= 1200) {
                    print(c, w, w);
                    System.out.print(" p.m.\n");
                } else if (w <= 1259) {
                    print(c, w, w);
                    System.out.print(" a.m.\n");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
