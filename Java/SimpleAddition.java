// https://open.kattis.com/problems/simpleaddition

import java.math.BigInteger;
import java.util.Scanner;

public class SimpleAddition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        BigInteger a, b;
        a = sc.nextBigInteger();
        b = sc.nextBigInteger();
        System.out.println(a.add(b));
        sc.close();
    }
}
