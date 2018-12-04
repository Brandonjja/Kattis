// https://open.kattis.com/problems/lineup

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LineThemUp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<String> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(sc.nextLine());
        }
        List<String> sorted = new ArrayList<>();
        sorted.addAll(l);
        Collections.sort(sorted);
        if (sorted.equals(l)) {
            System.out.println("INCREASING");
        } else {
            Collections.reverse(sorted);
            if (sorted.equals(l)) {
                System.out.println("DECREASING");
            } else {
                System.out.println("NEITHER");
            }
        }
        sc.close();
    }
}
