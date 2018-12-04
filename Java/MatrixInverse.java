// https://open.kattis.com/problems/matrix

import java.util.Scanner;

public class MatrixInverse {
    static Scanner sc = new Scanner(System.in);
    static int matrix[][] = new int[2][2];

    static void print() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j]);
                if (j != 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static int[][] getMatrix(int m[][]) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        return m;
    }

    public static void main(String args[]) {
        int temp, c = 1;
        do {
            getMatrix(matrix);
            double det = 1 / (double) (matrix[0][0] * matrix[1][1] - matrix[1][0] * matrix[0][1]);
            temp = matrix[0][0];
            matrix[0][0] = matrix[1][1];
            matrix[1][1] = temp;

            matrix[0][1] *= -1;
            matrix[1][0] *= -1;

            matrix[0][0] = (int) (det * matrix[0][0]);
            matrix[0][1] = (int) (det * matrix[0][1]);
            matrix[1][0] = (int) (det * matrix[1][0]);
            matrix[1][1] = (int) (det * matrix[1][1]);

            System.out.print("Case " + c + ":\n");
            print();
            c++;

        } while (sc.hasNext());
    }
}
