import java.util.Scanner;

public class testStack {
    public static void main(String[] args) {
        int option;
        boolean status = true;
        SLinkStack stack = new SLinkStack();
        Scanner scanner = new Scanner(System.in);

        while(status) {
            System.out.print("Main Menu\n1. Create Stack\n2. Push\n3. Pop\n4. Top\n5. Show\n6. Exit\nPlease chose your choice: ");
            option = scanner.nextInt();

            switch (option) {
                // Create Stack
                case 1:
                    stack = new SLinkStack();
                    break;

                // Push
                case 2:
                    System.out.print("Please enter item you need to push: ");
                    stack.push(scanner.next());
                    break;

                // Pop
                case 3:
                    System.out.println(stack.empty() ? "Stack is no any items!!":("Pop value: " + stack.pop()));
                    break;

                // Top
                case 4:
                    System.out.println(stack.empty() ? "Stack is no any items!!":("Top value: " + stack.top()));
                    break;

                // Show
                case 5:
                    stack.show();
                    break;

                // Exit
                case 6:
                    stack.show();
                    System.out.println("\nThis program was ending!!");
                    status = false;
                    break;
            }

            System.out.println("\n"+"======".repeat(10));
        }
    }
}
