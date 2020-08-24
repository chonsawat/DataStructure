import java.util.Arrays;
import java.util.Scanner;

public class ArrayQueue {
    String[] Q;
    int front, back, amount;
    String item;
    Scanner scanner = new Scanner(System.in);

    public ArrayQueue(int size){
        if (size > 0) {
            Q = new String[size];
            front = -1;
            back = -1;
        }
    }

    // Check queue empty
    public boolean isEmpty(){
        return amount == 0;
    }

    // Add queue at back
    public void enqueue(){
        // ถ้า Queue เต็ม
        if (amount >= Q.length) {
            System.out.println("Queue now was full!!");
            return;
        }

        // Asking name
        System.out.print("Enqueue your name: ");
        item = scanner.nextLine();

        // ถ้ายังไม่มี front
        if (front == -1
            &back == -1)
        {
            Q[++front] = item;
            back++;
        } else {
            if (back == Q.length-1) {
                back = 0;
                Q[back] = item;
            } else {
                Q[++back] = item;
            }
        }

        amount++;
    }

    // Pop front of queue
    public String dequeue(){
        String item;

        // Check empty
        if (isEmpty())
            return null;

        // Decrease amount
        amount--;

        if (front == Q.length-1){
            item = Q[front];
            Q[front] = null;
            front = 0;
        } else {
            item = Q[front++];
            Q[front-1] = null;
        }
        return item;
    }

    // Head of Queue
    public String first(){
        if (isEmpty())
            return "No Item in Queue";
        return Q[front];
    }

    // Show All
    public void show(){
        int tmp = front;
        if (!isEmpty()){
            System.out.print("All in queue is: ");
            for (int i=0; i<amount; i++){
                if (tmp == Q.length-1){
                    System.out.print(Q[tmp] + " ");
                    tmp = 0;
                } else {
                    System.out.print(Q[tmp++] + " ");
                }
            }

            System.out.println();
        }
    }

}
