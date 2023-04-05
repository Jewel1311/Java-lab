import java.util.Scanner;

class Search {
    public static int search(int[] arr, int n){
        Scanner s = new Scanner(System.in);

        int e;
        System.out.println("Enter the item to be searched :");
        e = s.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i] == e){
                return (i+1);
                
            }
        }
        return(-1);
    }

    public static void main(String [] args){
        int[] arr;
        int n, e;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the array size :");
        n = s.nextInt();
        arr = new int[n];
        System.out.println("Enter the array :");
        for(int i =0; i<n;i++){
            arr[i] = s.nextInt();
        }
        int val = search(arr, n);
        if (val == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found in position "+ val);
        }
        
    }
}