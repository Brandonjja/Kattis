// https://open.kattis.com/problems/aboveaverage

import java.util.Scanner;

public class AboveAverage {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt(), n, total = 0;
        
        for (int i = 0; i < c; i++) {
            n = scanner.nextInt();
            int arr[] = new int[n];
            
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
                total += arr[j];
            }
            
            double count = 0, avg = (double) total / n;
            
            for (int j = 0; j < n; j++) {
                if (arr[j] > avg) {
                    ++count;
                }
            }
            
            System.out.printf("%.3f%%\n", ((count / n) * 100));
            count = 0;
            total = 0;
        }
        scanner.close();
    }
}
