// Eight Queens https://open.kattis.com/problems/8queens

import java.util.ArrayList;
import java.util.Scanner;

class Queen {
    int x, y;

    Queen(int i, int j) {
        x = i;
        y = j;
    }
}

public class EightQueens {
    static ArrayList<Queen> queens = new ArrayList<>();

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ctr = 0;
        char c[];
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        boolean valid = true;
        int j;
        for (int i = 7; i >= 0; i--) {
            c = sc.nextLine().toCharArray();
            j = 0;
            for (char w : c) {
                if (w == '*') {
                    ctr++;
                    queens.add(new Queen(j, i));
                    if (x.contains(j) || y.contains(i)) {
                        valid = false;
                    }
                    x.add(j);
                    y.add(i);
                    break;
                }
                j++;
            }
        }

        if (ctr != 8) {
            valid = false;
        }

        sc.close();
        if (!valid) {
            System.out.println("invalid");
            return;
        }
        for (Queen qq : queens) {
            for (Queen q : queens) {
                if (qq == q) {
                    continue;
                }
                int xd = qq.x - q.x;
                float xy = qq.y - q.y;
                float s = xd / xy;
                if (Math.abs(s) == 1) {
                    valid = false;
                    break;
                }
            }
        }
        if (!valid) {
            System.out.println("invalid");
        } else {
            System.out.println("valid");
        }
    }
}
