import java.util.Scanner;

public class testCircle {

    public static void main(String[] args) {
        // Create Variable
        double radius;

        // Prepare Scanner
        Scanner scanner = new Scanner(System.in);

        // Receive the radius
        System.out.print("Enter radius: ");
        radius = scanner.nextDouble();

        // Create Circle's object
        Circle circle = new Circle(radius);

        // Show all values
        circle.show();

        // Receive new radius
        System.out.print("\nEnter new radius: ");
        circle.setRadius(scanner.nextDouble());

        // Show all values
        circle.show();

    }
}
