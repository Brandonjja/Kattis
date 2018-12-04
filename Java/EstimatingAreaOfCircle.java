// https://open.kattis.com/problems/estimatingtheareaofacircle

import java.util.Scanner;

public class EstimatingAreaOfCircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double r, m, c, area, earea;
        do {
            r = sc.nextDouble();
            m = sc.nextDouble();
            c = sc.nextDouble();
            
            if (r == 0 && m == 0 && c == 0) {
                break;
            }
            
            area = Math.PI * Math.pow(r, 2);
            earea = (c / m) * Math.pow((2 * r), 2);
            
            System.out.println(Double.toString(area) + " " + earea);
            
        } while (true);
        sc.close();
    }
}
