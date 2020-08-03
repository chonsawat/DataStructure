import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        /*
            ตั้งแต่ข้อ 3-5 ผมเอาสูตรจาก Internet
            สูตรที่ใช้ link : https://www.nectec.or.th/schoolnet/library/create-web/10000/science/10000-11636.html
         */
        int low, height, result;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        low = scanner.nextInt();

        System.out.print("Enter b: ");
        height = scanner.nextInt();

        result = ((low+height)*((height-low)/2+1))/2;
        System.out.printf("Sum of even from %d - %d: %d", low, height, result);

    }
}
