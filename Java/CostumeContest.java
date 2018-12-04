// https://open.kattis.com/problems/costumecontest

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CostumeContest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s;
        sc.nextLine();
        ArrayList<String> l = new ArrayList<>();
        Map<String, Integer> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            s = sc.nextLine();
            if (m.containsKey(s)) {
                m.put(s, m.get(s) + 1);
            } else {
                m.put(s, 0);
            }
        }
        int min = Collections.min(m.values());
        for (String a : m.keySet()) {
            if (min == m.get(a)) {
                if (!l.contains(a)) {
                    l.add(a);
                }
            }
        }
        Collections.sort(l);
        for (String a : l) {
            System.out.println(a);
        }
        sc.close();
    }
}
