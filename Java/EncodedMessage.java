// Encoded Message https://open.kattis.com/problems/encodedmessage

import java.util.Scanner;

public class EncodedMessage {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            char line[] = sc.nextLine().toCharArray();
            int s = (int) Math.sqrt(line.length);
            int start = -1;
            int first = start + s;

            for (int j = 0; j < line.length; j++) {
                try {
                    start += s;
                    System.out.print(line[start]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    --first;
                    start = first;
                    System.out.print(line[start]);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
