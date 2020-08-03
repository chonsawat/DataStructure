import java.util.Scanner;

public class Main {

    public static int factorial(int n){
        if (n == 0)
            return 1;
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
	    // write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        System.out.printf("Answers is: %d", factorial(n));

    }
}
