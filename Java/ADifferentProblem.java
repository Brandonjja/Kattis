// https://open.kattis.com/problems/different

import java.util.Scanner;

public class DiffProblem {
    
    static long diff(long x, long y) {
        return Math.abs(x - y);
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(diff(sc.nextLong(), sc.nextLong()));
        } while (sc.hasNext());
        sc.close();
    }
}
