import java.util.Scanner;

class Hillstations {

    void famousfor() {
        System.out.println("Hillstation is famous for its scenic beauty.");
    }

    void famousfood() {
        System.out.println("Hillstation has delicious local food.");
    }
}

class Manali extends Hillstations {
    void famousfor() {
        System.out.println("Manali is famous for snow and mountains.");
    }

    void famousfood() {
        System.out.println("Manali is famous for Siddu.");
    }
}

class Mussoorie extends Hillstations {
    void famousfor() {
        System.out.println("Mussoorie is famous for hills and waterfalls.");
    }

    void famousfood() {
        System.out.println("Mussoorie is famous for Momos.");
    }
}

class Darjeeling extends Hillstations {
    void famousfor() {
        System.out.println("Darjeeling is famous for tea gardens.");
    }

    void famousfood() {
        System.out.println("Darjeeling is famous for Thukpa.");
    }
}

public class TestHillstations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hillstations h;

        System.out.println("Choose Hillstation:");
        System.out.println("1. Manali");
        System.out.println("2. Mussoorie");
        System.out.println("3. Darjeeling");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                h = new Manali();
                break;
            case 2:
                h = new Mussoorie();
                break;
            case 3:
                h = new Darjeeling();
                break;
            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        // Runtime Polymorphism
        h.famousfor();
        h.famousfood();

        sc.close();
    }
}
