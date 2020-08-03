import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        int n, result;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n(integer): ");
        n = scanner.nextInt();
        result = (1+n)*n/2;
        System.out.println("Sum of all is: " + result);
    }
}
