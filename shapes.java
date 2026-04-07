import java.util.Scanner;

class Shapes {
    double length, breadth, radius;

    // Constructor for Rectangle
    Shapes(double l, double b) {
        length = l;
        breadth = b;
    }

    // Constructor for Square
    Shapes(double side) {
        length = side;
    }

    // Constructor for Circle
    Shapes(double r, boolean isCircle) {
        radius = r;
    }

    // Method Overloading
    double area(double l, double b) {
        return l * b;
    }

    double area(double side) {
        return side * side;
    }

    double areaCircle(double r) {
        return 3.14 * r * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Shape:");
        System.out.println("1. Rectangle");
        System.out.println("2. Square");
        System.out.println("3. Circle");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter length: ");
                double l = sc.nextDouble();
                System.out.print("Enter breadth: ");
                double b = sc.nextDouble();
                Shapes rect = new Shapes(l, b);
                System.out.println("Area of Rectangle: " + rect.area(l, b));
                break;

            case 2:
                System.out.print("Enter side: ");
                double s = sc.nextDouble();
                Shapes square = new Shapes(s);
                System.out.println("Area of Square: " + square.area(s));
                break;

            case 3:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                Shapes circle = new Shapes(r, true);
                System.out.println("Area of Circle: " + circle.areaCircle(r));
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
