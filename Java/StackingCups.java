// https://open.kattis.com/problems/cups

import java.util.Scanner;

public class StackingCups {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String colors[] = new String[n], tmp2;
        double data[] = new double[n], tmp;

        for (int i = 0; i < n; i++) {
            String[] a = sc.nextLine().split(" ");
            try {
                data[i] = Integer.parseInt(a[0]) / 2;
                colors[i] = a[1];
            } catch (NumberFormatException e) {
                data[i] = Integer.parseInt(a[1]);
                colors[i] = a[0];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (data[j] < data[j - 1]) {
                    tmp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = tmp;
                    tmp2 = colors[j];
                    colors[j] = colors[j - 1];
                    colors[j - 1] = tmp2;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(colors[i]);
        }
        sc.close();
    }
}
