import java.util.Scanner;

class Complex {
    int r, i;

    void read(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter real and imaginary part : ");
        r = s.nextInt();
        i = s.nextInt();
    }
    void display(){
        System.out.println("After addition \n**************");
        System.out.println(r +" + "+ i + "i");
    }
    public static void main(String[] args){
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        Complex c = new Complex();

        c1.read();
        c2.read();
        c.r = c1.r + c2.r;
        c.i = c1.i + c2.i;
        c.display();

    }
}