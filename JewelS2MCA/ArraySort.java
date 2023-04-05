import java.util.Scanner;

class ArraySort {
    public static void arraySort(int n , int[] arr){
        int temp;
        for(int i=0; i<arr.length;i++){
            temp = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[j] > arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Array after Sorting");
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args){
        int[] arr;
        int n;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the array size :");
        n = s.nextInt();
        arr = new int[n];
        System.out.println("Enter the array :");
        for(int i =0; i<n;i++){
            arr[i] = s.nextInt();
        }
        arraySort(n, arr);
    }
}