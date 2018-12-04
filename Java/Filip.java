// https://open.kattis.com/problems/filip

import java.util.Scanner;

public class Filip {
    static char [] flip(char[] c) {
        char cc = c[0];
        c[0] = c[2];
        c[2] = cc;
        return c;
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt(), n2 = scanner.nextInt();
        
        String s1 = Integer.toString(n1);
        String s2 = Integer.toString(n2);
        
        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();
        
        flip(c1);
        flip(c2);
        
        String ss = new String(c1);
        String ss2 = new String(c2);
        
        System.out.println(Integer.max(Integer.parseInt(ss), Integer.parseInt(ss2)));
    }
}
