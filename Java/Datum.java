// https://open.kattis.com/problems/datum

import java.time.LocalDate;
import java.util.Scanner;

public class Datum {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt(), m = scanner.nextInt();
        String day = LocalDate.of(2009, m, d).getDayOfWeek().toString();
        switch (day) {
        case "SUNDAY":
            System.out.println("Sunday");
            break;
        case "MONDAY":
            System.out.println("Monday");
            break;
        case "TUESDAY":
            System.out.println("Tuesday");
            break;
        case "WEDNESDAY":
            System.out.println("Wednesday");
            break;
        case "THURSDAY":
            System.out.println("Thursday");
            break;
        case "FRIDAY":
            System.out.println("Friday");
            break;
        case "SATURDAY":
            System.out.println("Saturday");
            break;
        }
    }
}
