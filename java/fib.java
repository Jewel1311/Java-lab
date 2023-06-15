import java.util.Scanner;
class fib{
	fib(int n){
		int a=1,b=0,c;
		System.out.println("Fibanocci:");
		for(int i=0;i<n;++i){
			System.out.print(b+"    ");
			c=a+b;
			a=b;
			b=c;
		}
	}
	public static void main(String arg[]){
		int n;
		System.out.print("Enter limit:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		new fib(n);
		
	}
}















/*import java.util.Scanner;
class fib{
	public static void main(String arg[]){
		int a=1,b=0,c,n;
		System.out.print("Enter limit:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Fibanocci:");
		for(int i=0;i<n;++i){
			System.out.print(b+"    ");
			c=a+b;
			a=b;
			b=c;
		}
	}
}*/
