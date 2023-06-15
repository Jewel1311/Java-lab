import java.util.Scanner;
import java.lang.Math;
class prime{
    public static void main(String arg[]){
        int n;
        boolean b=true;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number:");
        n=sc.nextInt();
        for(int i=2 ;i<=Math.sqrt(n);++i){
            if(n%i==0){
                b=false;
                break;
            }
        }
        if(b){
            System.out.println(n+" is prime number");
        }
        else
            System.out.println(n+" is not a prime number");

    }
}