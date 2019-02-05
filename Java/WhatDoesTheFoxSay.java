// What does the fox say? https://open.kattis.com/problems/whatdoesthefoxsay

import java.util.ArrayList;
import java.util.Scanner;

public class WhatDoesTheFoxSay {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String words = sc.nextLine();
            String line, an[];
            ArrayList<String> list = new ArrayList<>();
            while (true) {
                line = sc.nextLine();
                if (!line.equals("what does the fox say?")) {
                    an = line.split(" ");
                    list.add(an[2]);
                } else {
                    break;
                }
            }
            an = words.split(" ");
            for (String w : an) {
                if (!list.contains(w)) {
                    System.out.print(w + " ");
                }
            }
        }
        sc.close();
    }
}
