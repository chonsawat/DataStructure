import java.util.Scanner;

public class testCircle {
    public static void main(String[] args) {
        double radius;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        radius = scanner.nextDouble();

        Circle circle = new Circle(radius);

        System.out.printf("Area: %f\n", circle.area());
        System.out.printf("Circumference: %f\n", circle.circumference());
        System.out.printf("Volume: %f\n", circle.volume());
        System.out.println("Radius: " + circle.getRadius());

        System.out.print("\nEnter new radius: ");
        circle.setRadius(scanner.nextDouble());

        System.out.printf("Area: %f\n", circle.area());
        System.out.printf("Circumference: %f\n", circle.circumference());
        System.out.printf("Volume: %f\n", circle.volume());
        System.out.println("Radius: " + circle.getRadius());

    }
}
