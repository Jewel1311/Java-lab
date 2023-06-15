import java.util.Scanner;
class product1{
    String pcode,pname;
    Float price;
    product1(String pcode,String pname,Float price){
	    this.pcode=pcode;
	    this.pname=pname;
	    this.price=price;
	}
	static product1 readdata(){
	        String pcode,pname;
    	    Float price;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter product code:");
            pcode=sc.nextLine();
            System.out.print("Enter product name:");
            pname=sc.nextLine();
            System.out.print("Enter product price:");
            price=sc.nextFloat();
	        return new product1(pcode,pname,price);
    }
    public static void main(String arg[]){
        System.out.println("Enter product1 details:");
        product1 p1=readdata();
        System.out.println("Enter product2 details:");
        product1 p2=readdata();
        System.out.println("Enter product3 details:");
        product1 p3=readdata();
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
