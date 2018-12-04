// https://open.kattis.com/problems/busnumbers

import java.util.Arrays;
import java.util.Scanner;

public class BusNumbers {
    public static void main(String args[]) {
        int n, A[], flag = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            n = scanner.nextInt();
        } while (!((1 <= n) && (n <= 1000)));
        A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        Arrays.sort(A);
        for (int i = 0; i <= n; i++) {
            try {
                if (A[i] == (A[i + 1]) - 1) {
                    if (flag == 0) {
                        System.out.print(A[i]);
                        try {
                            if ((A[i] == (A[i + 1] - 1) && (A[i] == (A[i + 2] - 2)))) {
                                System.out.print("-");
                                flag = 1;
                            } else {
                                System.out.print(" ");
                            }
                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.out.print(" ");
                        }
                    } else {
                        continue;
                    }
                } else {
                    flag = 0;
                    System.out.print(A[i] + " ");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(A[i]);
                break;
            }
        }
    }
}
