import java.util.Scanner;

public class testCircle {

    public static void main(String[] args) {
        double radius;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        radius = scanner.nextDouble();

        Circle circle = new Circle(radius);

        circle.show();

        System.out.print("\nEnter new radius: ");
        circle.setRadius(scanner.nextDouble());

        circle.show();

    }
}
