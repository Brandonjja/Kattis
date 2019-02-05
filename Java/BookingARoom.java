// Booking a Room https://open.kattis.com/problems/bookingaroom

import java.util.ArrayList;
import java.util.Scanner;

public class BookingARoom {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int booked = sc.nextInt();
        ArrayList<Integer> rooms = new ArrayList<>();
        
        for (int i = 0; i < booked; i++) {
            rooms.add(sc.nextInt());
        }

        if (r == booked) {
            System.out.println("too late");
            sc.close();
            return;
        }

        for (int i = 1; i <= r; i++) {
            if (!rooms.contains(i)) {
                System.out.println(i);
                break;
            }
        }

        sc.close();
    }
}
