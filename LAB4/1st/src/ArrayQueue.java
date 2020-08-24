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

    public boolean isEmpty(){
        return amount == 0;
    }

    public void enqueue(){
        // ถ้า Queue เต็ม
        if (amount >= Q.length) {
            System.out.println("Queue now was full!!");
            return;
        }

        // Asking name
        System.out.print("Enqueue your name:");
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

    public String dequeue(){
        String item;
        if (isEmpty())
            return null;

        // Increase & Decrease
        amount--;

        if (front > Q.length){
            item = Q[front++%Q.length];
            Q[front++%Q.length] = null;
            return item;
        }

        item = Q[front];
        Q[front++] = null;
        return item;
    }

    // Head of Queue
    public String first(){
        System.out.println(front + "-" + back);
        if (isEmpty())
            return "No Item in Queue";
        return Q[front];
    }

    // Show All
    public void show(){
        int tmp = front;
        if (!isEmpty()){
            System.out.print("All in queue is: ");
            for (int i=0; i<Q.length; i++){
                if (tmp == Q.length-1)
                    tmp %= Q.length;

                if (Q[tmp] != null)
                    if (tmp == Q.length-1)
                        System.out.print(Q[tmp] + " ");
                    else
                        System.out.print(Q[tmp++] + " ");
            }

            System.out.println();
        }
    }

    public String toString(){
        return Arrays.toString(Q);
    }



}
