import java.util.*;

class cpu {

    double price;

    class processor {
        int no_of_cores;
        String manufacture;

    }

    static class RAM {
        int memory;
        String manufacture;
    }

    public static void main(String[] args) {
        cpu cpu1 = new cpu();
        cpu.RAM ram = new cpu.RAM();
        cpu.processor prs = cpu1.new processor();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of cpu:");
        cpu1.price = sc.nextDouble();
        System.out.print("Enter the no of cores of processor:");
        prs.no_of_cores = sc.nextInt();
        System.out.print("Enter the manufacture of processor:");
        prs.manufacture = sc.nextLine();
        System.out.print("Enter the memory of ram:");
        ram.memory = sc.nextInt();
        System.out.print("Enter the manufacture of ram:");
        ram.manufacture = sc.nextLine();
        System.out.println("CPU DETAILS");
        System.out.println("Price:" + cpu1.price);
        System.out.println("Number of core of processor:" + prs.no_of_cores);
        System.out.println("Manufactur of processor:" + prs.manufacture);
        System.out.println("Memory of RAM:" + ram.memory);
        System.out.println("Manufactur of RAM:" + ram.manufacture);

    }
}
