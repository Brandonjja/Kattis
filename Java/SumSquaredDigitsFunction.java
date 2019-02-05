// Sum Squared Digits Function https://open.kattis.com/problems/sumsquareddigits

import java.util.Scanner;

public class SumSquaredDigitsFunction {

    static String convert(String base, String num) {
        return Integer.toString(Integer.parseInt(num, 10), Integer.parseInt(base));
    }

    static int calc(String num) {
        char c[] = num.toCharArray();
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            sum += Math.pow(Integer.parseInt(String.valueOf(c[i])), 2);
        }
        return sum;
    }

    static int calcAlpha(String num) {
        char c[] = num.toCharArray();
        int sum = 0;
        for (int i = c.length - 1; 0 <= i; i--) {
            switch (c[i]) {
            case 'a':
                sum += 100;
                break;
            case 'b':
                sum += 121;
                break;
            case 'c':
                sum += 144;
                break;
            case 'd':
                sum += 169;
                break;
            case 'e':
                sum += 196;
                break;
            case 'f':
                sum += 225;
                break;
            default:
                sum += Math.pow(Integer.parseInt(String.valueOf(c[i])), 2);
                break;
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String line[] = sc.nextLine().split(" ");
            String s = convert(line[1], line[2]);
            if (Integer.parseInt(line[1]) > 10) {
                System.out.println((i + 1) + " " + calcAlpha(s));
            } else {
                System.out.println((i + 1) + " " + calc(s));
            }

        }
        sc.close();
    }
}
