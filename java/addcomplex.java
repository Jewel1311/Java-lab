import java.util.Scanner;

public class addcomplex {
    public static void main(String[] arg) {
        System.out.println("Enter complex number1:");
        complex c1 = new complex();
        c1.readdata();
        System.out.println("Enter complex number2:");
        complex c2 = new complex();
        c2.readdata();
        complex c3 = new complex();
        c3.sumcomplex(c1, c2);
        System.out.println("Sum Complex no:" + c3.printcomplex());

    }
}

class complex {
    int i, j;

    void readdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("real part:");
        this.i = sc.nextInt();
        System.out.print("imaginary part:");
        this.j = sc.nextInt();
    }

    void sumcomplex(complex ob1, complex ob2) {
        i = ob1.i + ob2.i;
        j = ob1.j + ob2.j;
    }

    String printcomplex() {
        String s;
        if (j > -1) {
            s = String.format("%d+%di", i, j);

        } else
            s = String.format("%d-%di", i, -j);
        return s;
    }
}