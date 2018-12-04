// https://open.kattis.com/problems/hissingmicrophone

import java.util.Scanner;

public class HissingMic {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char c[] = new char[30];
        c = s.toCharArray();

        for (int i = 0; i < 30; i++) {
            try {
                if (c[i] == c[i + 1] && c[i] == 's') {
                    System.out.println("hiss");
                    break;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("no hiss");
                break;
            }
        }
    }
}
