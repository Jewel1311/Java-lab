import java.util.Scanner;

public class matrixaddition {
    public static void main(String[] arg) {
        int[][] a, b, c;
        a = new int[10][10];
        b = new int[10][10];
        c = new int[10][10];
        int i, j, n, m;
        System.out.print("Enter the size of array:");
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        System.out.print("Enter elements into matrix1:");

        for (i = 0; i < m; ++i) {
            for (j = 0; j < n; ++j) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter elements into matrix2:");

        for (i = 0; i < m; ++i) {
            for (j = 0; j < n; ++j) {
                b[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < m; ++i) {
            for (j = 0; j < n; ++j) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Sum matrix:");
        for (i = 0; i < m; ++i) {
            for (j = 0; j < n; ++j) {
                System.out.print("\t" + c[i][j]);
            }
            System.out.println();
        }
    }
}
