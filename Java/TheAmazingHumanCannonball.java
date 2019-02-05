// The Amazing Human Cannonball https://open.kattis.com/problems/humancannonball2

import java.util.Scanner;

public class TheAmazingHumanCannonball {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        double g = 9.81;
        for (int i = 0; i < n; i++) {
            String line[] = sc.nextLine().split(" ");
            double v = Double.parseDouble(line[0]);
            double o = Double.parseDouble(line[1]);
            double x = Double.parseDouble(line[2]);
            double h1 = Double.parseDouble(line[3]) + 1;
            double h2 = Double.parseDouble(line[4]) - 1;
            double t = x / (v * Math.cos(Math.toRadians(o)));
            double ans = v * t * Math.sin(Math.toRadians(o)) - 0.5 * g * Math.pow(t, 2);
            if (ans > h1 && ans < h2) {
                System.out.println("Safe");
            } else {
                System.out.println("Not Safe");
            }
        }
        sc.close();
    }
}
