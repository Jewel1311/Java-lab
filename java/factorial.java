import java.util.Scanner;
class factorial{
	factorial(int n){
		int f=1;
		while(n>0){
            f*=n;
            --n;
        }
        System.out.println("Factorial:"+f);
	}
    public static void main(String arg[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        n=sc.nextInt();
        new factorial(n);
    }
}










/*import java.util.Scanner;
class factorial{
    public static void main(String arg[]){
        int n,f=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        n=sc.nextInt();
        while(n>0){
            f*=n;
            --n;
        }
        System.out.println("Factorial:"+f);
    }
}*/
