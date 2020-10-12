public class InsertionSort {
    public static void lessThan(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int tmp = arr[i]; // Use to compare
            int j = i-1; // index before current

            for(; j >= 0 && arr[j] > tmp; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j+1] = tmp;
        }
   }

    public static void moreThan(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int tmp = arr[i]; // Use to compare
            int j = i - 1; // index before current

            for(; j >= 0 && arr[j] < tmp; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j+1] = tmp;
        }
    }

    public static void print(int[] arr) {
        // พิมพ์ค่าออกมาดู
        System.out.print("Array value: ");
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}