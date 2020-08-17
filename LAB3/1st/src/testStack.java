import java.util.Scanner;

public class testStack {

    public static void main(String[] args) {
        // Variable
        int option;
        double value;
        boolean status = true;
        Scanner scanner = new Scanner(System.in);

        // Stack must have at least 1
        Stack stack = new Stack(10);

        while (status) {
            // Ask for option
            System.out.print("\nMain menu\n1. Create Stack\n2. Push\n3. Pop\n4. Top\n5. Show\n6. Exit\nPlease choose your choice: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter size of stack: ");
                    value = scanner.nextInt();
                    stack = new Stack((int) value);
                    System.out.printf("Created the new stack size: %d !!", (int) value);
                    break;
                case 2:
                    System.out.print("Enter the value do you need to push: ");
                    value = scanner.nextDouble();
                    break;
                case 3:
                    System.out.println("Pop the value : something");
                    break;
                case 4:
                    System.out.println("Now top is value: , index:");
                    break;
                case 5:
                    stack.show();
                    break;
                case 6:
                    System.out.println("Exited the program");
                    status = false;
                    break;
                default:
                    System.out.println("Please enter correct integer!!");
                    break;
            }
        }
    }
}
