import java.util.Scanner;

class MatrixSum {
    public static void sum(int r, int c , int[][] a1, int[][] a2){
        int temp;
        int sum[][] = new int[r][c];
        for(int i=0; i<r;i++){
            for(int j=0; j<c; j++){
                sum[i][j] = a1[i][j] + a2[i][j];
            }
        }

        System.out.println("Sum\n");
        for(int i=0; i<r;i++){
            for(int j=0; j<c; j++){
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println();
        }
    }


    public static void main(String[] args){
        int[][] a1, a2;
        int r,c;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the row and column size :");
        r = s.nextInt();
        c = s.nextInt();


        a1 = new int[r][c];
        a2 = new int[r][c];

        System.out.println("Enter the matrix 1 :");
        for(int i =0; i<r;i++){
            for(int j=0; j<c;j++)
                a1[i][j] = s.nextInt();
        }
        System.out.println("Enter the matrix 2 :");
        for(int i =0; i<r;i++){
            for(int j=0; j<c;j++)
                a2[i][j] = s.nextInt();
        }
        sum(r,c, a1, a2);
    }
}