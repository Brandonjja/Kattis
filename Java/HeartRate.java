// https://open.kattis.com/problems/heartrate

import java.util.Scanner;

public class HeartRate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double p, minbpm, bpm, maxbpm, d, b;
        for (int i = 0; i < n; i++) {
            b = sc.nextDouble();
            p = sc.nextDouble();
            bpm = (60 * b) / p;
            d = bpm / b;
            minbpm = bpm - d;
            maxbpm = bpm + d;   
            System.out.println(minbpm + " " + bpm + " " + maxbpm);
        }
        sc.close();
    }
}
