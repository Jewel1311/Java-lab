import java.util.Scanner;
class palindrome{
    public static void main(String arg[]){
        int n,d,t,r=0;
        System.out.print("Enter number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        t=n;
        while(t>0){
            d=t%10;
            r=r*10+d;
            t/=10;
        }
        if(n==r)
            System.out.println(n+" is palindrome");
        else System.out.println(n+" is not palindrome");
    }
}