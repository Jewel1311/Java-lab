import java.util.Scanner;

class Authenticate extends Exception{
    Authenticate(){
        System.out.println("Invalid Credentials");
    }
}

class Exception2 {
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the username : ");
        String uname = sc.nextLine();
        System.out.print("Enter password : ");
        String pass = sc.nextLine();
        try{
            if(uname.equals("user") && pass.equals("123")){
                System.out.println("Valid Credentials");
            }
            else{
                throw new Authenticate();
            }
        }
        catch(Authenticate e){
            System.out.println("Exception handled");
        }
    }
}