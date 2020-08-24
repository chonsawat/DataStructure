import java.util.Arrays;

public class ArrayQueue {
    String[] Q;
    int front, back, amount;

    public ArrayQueue(int size){
        if (size > 0)
            Q = new String[size];

        front = -1;
        back = -1;
    }

    public boolean isEmpty(){
        return amount == 0;
    }

    public void enqueue(String item){
        System.out.println(item);
    }

    // Show All
    public String toString(){
        return Arrays.toString(Q);
    }



}
