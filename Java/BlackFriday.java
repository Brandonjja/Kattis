// Black Friday https://open.kattis.com/problems/blackfriday

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class BlackFriday {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        sc.nextLine();
        String line = sc.nextLine();
        String c[] = line.split(" ");
        ArrayList<Integer> winners = new ArrayList<>();

        HashMap<String, String> win = new HashMap<>();
        HashMap<String, String> lose = new HashMap<>();

        for (int i = 0; i < c.length; i++) {
            if (win.containsKey(c[i])) {
                lose.put(c[i], c[i]);
            } else {
                win.put(c[i], c[i]);
            }
        }

        for (String w : win.keySet()) {
            if (!lose.containsKey(w)) {
                winners.add(Integer.parseInt(w));
            }
        }

        try {
            int winner = Collections.max(winners);
            System.out.println((line.indexOf(String.valueOf(winner)) / 2) + 1);
            sc.close();
        } catch (NoSuchElementException e) {
            System.out.println("none");
        }
    }
}
