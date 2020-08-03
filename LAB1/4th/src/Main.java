import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        int low, height, result;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        low = scanner.nextInt();

        System.out.print("Enter b: ");
        height = scanner.nextInt();

        result = ((low+height)*((height-low)+1))/2;
        System.out.printf("Sum from %d - %d : %d", low, height, result);
    }
}
