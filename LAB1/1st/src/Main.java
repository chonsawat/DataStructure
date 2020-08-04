import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        double base, height;
        System.out.print("Enter base: ");
        base = scanner.nextDouble();

        System.out.print("Enter height: ");
        height = scanner.nextDouble();

        double result = 0.5 * base * height;
        System.out.println("Answer: " + result);
    }
}
