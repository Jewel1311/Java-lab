import java.util.Scanner;
class product{
    String pcode,pname;
    Float price;
    product(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter product code:");
        this.pcode=sc.nextLine();
        System.out.print("Enter product name:");
        this.pname=sc.nextLine();
        System.out.print("Enter product price:");
        this.price=sc.nextFloat();
    }
    public static void main(String arg[]){
	System.out.println("Enter product1 details:");
        product p1=new product();
	System.out.println("Enter product2 details:");
        product p2=new product();
	System.out.println("Enter product3 details:");
        product p3=new product();
        if(p1.price<p2.price){
            if(p1.price<p3.price)
                System.out.println(p1.pname+" is lowest price product");
            else System.out.println(p3.pname+" is lowest price product");
        }
        else if(p2.price<p3.price)
            System.out.println(p2.pname+" is lowest price product");
        else
            System.out.println(p3.pname+" is lowest price product");
    }
}



/*import java.util.Scanner;
class product{
    String pcode,pname;
    Float price;
    void readdata(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter product code:");
        this.pcode=sc.nextLine();
        System.out.print("Enter product name:");
        this.pname=sc.nextLine();
        System.out.print("Enter product price:");
        this.price=sc.nextFloat();
    }
    public static void main(String arg[]){
        product p1=new product();
        product p2=new product();
        product p3=new product();
        System.out.println("Enter product1 details:");
        p1.readdata();
        System.out.println("Enter product2 details:");
        p2.readdata();
        System.out.println("Enter product3 details:");
        p3.readdata();
        if(p1.price<p2.price){
            if(p1.price<p3.price)
                System.out.println(p1.pname+" is lowest price product");
            else System.out.println(p3.pname+" is lowest price product");
        }
        else if(p2.price<p3.price)
            System.out.println(p2.pname+" is lowest price product");
        else
            System.out.println(p3.pname+" is lowest price product");
    }
}
*/
