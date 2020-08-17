public class Stack {
    int top = -1;
    double[] stack;

    // Must enter when create stack...
    public Stack(int size){
        this.stack = new double[size];
    }

    void push(double item){
        // Check stack full

        top++;

        // Push
    }

    double pop(){
        // Check empty

        // Pop
        return stack[top];
    }

    double top(){
        return stack[top];
    }

    boolean empty(){
        boolean check = top == -1;
        if (check){
            System.out.println("Is empty!!");
            return true;
        }

        System.out.println("Not empty!!");
        return false;
    }

    void show(){
        System.out.println("Show all values in stack...\nvalues: ");
        for (int i=top; i>-1; i--){
            System.out.printf("%f\t", stack[i]);
        }
    }
}
