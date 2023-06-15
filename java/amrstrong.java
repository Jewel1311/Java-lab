import java.util.Scanner;
class armstrong{
	armstrong(int n){
	    int d,t,a=0;
	    t=n;
        while(t>0){
            d=t%10;
            a=a+d*d*d;
            t/=10;
        }
        if(n==a)
            System.out.println(n+" is armstong");
        else System.out.println(n+" is not armstong");
	}
    public static void main(String arg[]){
        int n;
        System.out.print("Enter number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        new armstrong(n);
    }
}



















/*import java.util.Scanner;
class armstrong{
    public static void main(String arg[]){
        int n,d,t,a=0;
        System.out.print("Enter number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        t=n;
        while(t>0){
            d=t%10;
            a=a+d*d*d;
            t/=10;
        }
        if(n==a)
            System.out.println(n+" is armstong");
        else System.out.println(n+" is not armstong");
    }
}
*/
