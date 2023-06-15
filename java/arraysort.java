
import java.util.Scanner;

class arraysort {
    public static void main(String[] arg) {
        int[] a = new int[10];
        int i, j, t, n;
        System.out.print("Enter the size of array:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.print("Enter elements:");
        for (i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
        }
        System.out.print("Array before sorting:");
        for (i = 0; i < n; ++i) {
            System.out.print(a[i] + "  ");
        }
        for (i = 1; i < n; ++i) {
            for (j = 0; j < n - i; ++j) {
                if (a[j] > a[j + 1]) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        System.out.print("Array after sorting:");
        for (i = 0; i < n; ++i) {
            System.out.print(a[i] + "  ");
        }
    }
}