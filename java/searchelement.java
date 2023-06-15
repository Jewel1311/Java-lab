import java.util.Scanner;

public class searchelement {
    public static void main(String[] args) {
        int i, loc = -1, s, n;
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        n = sc.nextInt();
        System.out.print("Enter elements:");
        for (i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter the element to be searched:");
        s = sc.nextInt();
        for (i = 0; i < n; ++i) {
            if (s == arr[i]) {
                loc = i;
                break;
            }
        }
        if (loc == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at pos:" + (loc + 1));
        }
    }
}
