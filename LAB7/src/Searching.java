import java.util.Scanner;
public class Searching {
    public static boolean BinarySearch(int Data[], int s) {
        int low, high, mid;
        int round = 1;
        low = 0;
        high = Data.length - 1;
        do {
            mid = low + (high - low) / 2;

            if (Data[mid] < s) {
                low = mid + 1;
            } else if (Data[mid] > s) {
                high = mid - 1;
            } else if (Data[mid] == s) {
                System.out.println("Found Data at position " + mid);
                return true;
            }

            System.out.printf("Round %d : low = %d high = %d mid = %d Data[%d] = %d compare with %d\n", round, low, high, mid, mid, Data[mid], s);
            round++;
        } while ((low <= high) & (Data[mid] != s));

        System.out.println("Not found");
        return false;
    }

    public static boolean InterpolationSearch(int Data[], int s) {
        int low, high, pos;
        low = 0;
        high = Data.length - 1;
        int round = 1;
        do {
            if ((Data[high]-Data[low])==0){
                System.out.println("Divided by Zero");
                return false;
            } else
                pos = low + (((s-Data[low])*(high-low)/(Data[high]-Data[low])));

            if (s>Data[high] | s<Data[low]){
                System.out.println("Not found Data");
                return false;
            } else if (Data[pos] < s) {
                low = pos + 1;
            } else if (Data[pos] > s) {
                high = pos - 1;
            } else if (Data[pos] == s) {
                System.out.println("Found Data at position " + pos);
                return true;
            }
			System.out.printf("Round %d  low = %d high = %d Data[%d] = %d Data compare with %d\n", round, low, high, pos, Data[pos], s);
			round++;
        } while ((low <= high) & (Data[pos] != s));

        System.out.println("Not found Data");
        return false;
    }
}