import java.util.Scanner;

public class employeearray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j = 0, eno;
        String str;
        double sal;
        System.out.print("Enter the number of employee:");
        n = sc.nextInt();
        employee[] emparr = new employee[10];
        for (i = 0; i < n; ++i) {
            System.out.println(("Enter details of employee" + (i + 1)));
            System.out.print("Enumber:");
            eno = sc.nextInt();
            System.out.print("Name:");
            str = sc.nextLine();
            System.out.print("Salary:");
            sal = sc.nextDouble();
            emparr[i] = new employee(eno, str, sal);
        }
        System.out.println("Enter the eNumber to search:");
        eno = sc.nextInt();
        for (i = 0; i < n; ++i) {
            if (emparr[i].enumber == eno) {
                System.out.println("Name:" + emparr[i].ename + "\tSalary:" + emparr[i].esalary);
                j = 1;
                break;
            }
        }
        if (j != 1) {
            System.out.println(eno + " not found!");
        }

    }
}

class employee {
    int enumber;
    String ename;
    double esalary;

    employee(int eno, String ename, double esalary) {
        this.enumber = eno;
        this.ename = ename;
        this.esalary = esalary;
    }
}