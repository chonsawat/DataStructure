public class Main {

    public static void main(String[] args) {
        int[] a = {4, 1, 3, 5, 2};
        InsertionSort.print(a);
        InsertionSort.lessThan(a);
        InsertionSort.print(a);

        int[] b = {4, 1, 3, 5, 2};
        InsertionSort.print(b);
        InsertionSort.moreThan(b);
        InsertionSort.print(b);
    }
}
