public class Stack {
    int top = -1;
    double[] stack;

    // Must enter when create stack...
    public Stack(int size){
        this.stack = new double[size];
    }

    void push(double item){
        // Check stack full & push
        if (top == stack.length-1) {
            System.out.println("Stack Full");
        } else {
            stack[++top] = item;
        }
    }

    double pop(){
        // Check empty
        if (empty()){
            System.out.println("Can't pop because empty!!");
            return -1;
        }

        double item = stack[top];
        stack[top--] = 0;

        return item;
    }

    double top(){
        if (empty())
            return -1;
        return stack[top];
    }

    boolean empty(){
        return top == -1;
    }

    void show(){
        System.out.printf("Show %d values in stack...\nvalues: ", stack.length);

        if (empty()) {
            System.out.println("No values in stack!!");
            return;
        }

        for (int i=top; i>-1; i--){
            System.out.printf("%f\t", stack[i]);
        }
        System.out.println();
    }
}
