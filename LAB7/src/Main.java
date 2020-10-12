import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option, select, size;
        boolean status = true;
        Scanner scanner = new Scanner(System.in);
        int Data[] = { 10, 14, 19, 26, 27, 31, 33, 35, 42, 44 }; // For lazy enter Arrays
        System.out.println("==============================");
        System.out.println("Main Menu");
        System.out.println("1. Input Data");
        System.out.println("2. Binary Search");
        System.out.println("3. Interpolation Search");
        System.out.println("4. exit");

        while(status) {
            System.out.print("\n");
            System.out.println("==============================");
            System.out.print("Please chose your choice : ");
            option = scanner.nextInt();

            switch (option) {
                case 1:// Input Data
                    System.out.print("Enter size of arrays : ");
                    size = scanner.nextInt();
                    Data = new int[size];
                    for (int i = 0; i < size; i++) {
                        System.out.println("Array " + i + " : ");
                        Data[i] = scanner.nextInt();
                    }
                    break;

                case 2: // Binary Search
                    System.out.print("Enter data to search : ");
                    select = scanner.nextInt();
                    Searching.BinarySearch(Data, select);
                    break;

                case 3: // Interpolation Search
                    System.out.print("Enter data to search : ");
                    select = scanner.nextInt();
                    Searching.InterpolationSearch(Data, select);
                    break;

                case 4: // exit
                    System.out.println("Thank you, next");
                    status = false;
                    break;
            }
        }
    }
}
