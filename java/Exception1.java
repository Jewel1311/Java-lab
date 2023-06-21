import java.util.Scanner;

class TooOld extends Exception {
    TooOld(String msg){
        System.out.println(msg);
    }
}

class TooYoung extends Exception {
    TooYoung(String msg){
        System.out.println(msg);
    }
}

class Exception1 {
    public static void main(String [] args) {
        System.out.print("Enter age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age > 60 ){
            try {
                throw new TooOld("You are too old ");
            }
            catch(TooOld e){
                System.out.println("Exception Handled");
            }
        }
        else if (age < 18) {
            try{
                throw new TooYoung("You are too young");
            }
            catch(TooYoung e){
                System.out.println("Exception Handled");
            }
        }
        else {
            System.out.println("Valid age");
        }
    }
}