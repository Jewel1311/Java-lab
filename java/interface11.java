import java.util.Scanner;

interface Shape {
    double area();

    double perimeter();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}

public class interface11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double result;

        do {
            System.out.println("Menu:");
            System.out.println("1. Calculate area and perimeter of a circle");
            System.out.println("2. Calculate area and perimeter of a rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();

                    Circle circle = new Circle(radius);
                    result = circle.area();
                    System.out.println("Area of the circle: " + result);

                    result = circle.perimeter();
                    System.out.println("Perimeter of the circle: " + result);
                    break;

                case 2:
                    System.out.print("Enter the length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = scanner.nextDouble();

                    Rectangle rectangle = new Rectangle(length, width);
                    result = rectangle.area();
                    System.out.println("Area of the rectangle: " + result);

                    result = rectangle.perimeter();
                    System.out.println("Perimeter of the rectangle: " + result);
                    break;

                case 3:
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }

            System.out.println();
        } while (choice != 3);

    }

}
