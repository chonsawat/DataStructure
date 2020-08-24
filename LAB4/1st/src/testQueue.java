import java.util.Scanner;

public class testQueue {

    public static void main(String[] args) {
	    // Variable
        int option, size;
        String item;
        boolean status = true;
        Scanner scanner = new Scanner(System.in);

        // Must have default queue
        ArrayQueue arr = new ArrayQueue(3);

        while(status) {
            // Asking option
            System.out.print("Main Menu\n1. create Queue\n2. enqueue\n3. dequeue\n4. first\n5. exit\nPlease chose your choice : ");
            option = scanner.nextInt();

            System.out.println(); // For prettier looking
            switch (option) {
                case 1: // Create
                    System.out.print("Creating, enter size of queue (must be positive number): ");
                    size = scanner.nextInt();
                    arr = new ArrayQueue(size);
                    break;

                case 2: // Enqueue
                    scanner.nextLine(); // Fix auto-enter bug
                    arr.enqueue();
                    break;

                case 3: // Dequeue
                    System.out.println("Dequeue item: " + (arr.isEmpty()?"Queue is no items!!":arr.dequeue()));
                    break;

                case 4: // First
                    System.out.println(arr.isEmpty()?arr.first():"First is: " + arr.first());
                    break;

                case 5: // Exit
                    status = false;
                    arr.show();
                    System.out.println("======== This program was exited!! ==========");
                    break;
            }

            System.out.println("==========".repeat(10));
        }
    }
}
