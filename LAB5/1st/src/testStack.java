import java.util.Scanner;

public class testStack {
    public static void main(String[] args) {
        int option;
        boolean status = true;
        Scanner scanner = new Scanner(System.in);

        while(status) {
            System.out.print("Main Menu\n1. Create Stack\n2. Push\n3. Pop\n4. Top\n5. Show\n6. Exit\nPlease chose your choice: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println(1);
                    break;

                case 2:
                    System.out.println(2);
                    break;

                case 3:
                    System.out.println(3);
                    break;

                case 4:
                    System.out.println(4);
                    break;

                case 5:
                    System.out.println(5);
                    break;

                case 6:
                    System.out.println(6);
                    status = false;
                    break;
            }

            System.out.println("\n"+"======".repeat(10));
        }
    }
}
