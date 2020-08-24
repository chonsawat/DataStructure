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

            switch (option) {
                case 1:
                    System.out.print("Creating, enter size of queue (must be positive number): ");
                    size = scanner.nextInt();
                    arr = new ArrayQueue(size);
                    break;

                case 2:
                    scanner.nextLine(); // Fix auto-enter bug
                    arr.enqueue();
                    System.out.println(arr);
                    break;

                case 3:
                    System.out.println("Dequeued item: " + (arr.isEmpty()?"Queue is no items!!":arr.dequeue()));
                    System.out.println(arr);
                    break;

                case 4:
                    System.out.println(arr.isEmpty()?arr.first():"First is: " + arr.first());
                    System.out.println(arr);
                    arr.show();
                    break;

                case 5:
                    status = false;
                    System.out.println("All item in queue: " + arr);
                    System.out.println("This program was exited!!");
                    break;
            }

            System.out.println("==========".repeat(10));
        }
    }
}
