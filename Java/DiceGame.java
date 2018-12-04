// https://open.kattis.com/problems/dicegame

import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gunnar = 0, emma = 0;
        for (int i = 0; i < 8; i++) {
            if (i <= 3) {
                gunnar += sc.nextInt();
            } else {
                emma += sc.nextInt();
            }
        }
        if (gunnar > emma) {
            System.out.println("Gunnar");
        } else if (emma > gunnar) {
            System.out.println("Emma");
        } else {
            System.out.println("Tie");
        }
        sc.close();
    }
}
