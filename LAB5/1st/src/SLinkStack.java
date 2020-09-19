public class SLinkStack {
    Node newNode;
    Node head;
    Node curr;
    Node prev;

    // Push
    public void push(String newItem){
        if (head == null) {
            newNode = new Node(newItem);
        } else {
            newNode = new Node(newItem, head);
        }
        head = newNode;
    }

    // Pop
    public String pop() {
        if (empty()) {
            System.out.println("Stack is no any items!!");
            return null;
        }

        curr = head;
        head = head.getLink();

        return curr.getItem();
    }

    // Top
    public String top() {
        if (empty())
            System.out.println("Stack is no any items!!");

        return head.getItem();
    }

    // Empty
    public boolean empty(){
        return head==null;
    }

    // Show
    public void show(){
        curr = new Node();
        prev = new Node();
        curr = head;
        prev = null;

        if (empty()) {
            System.out.println("Stack is no any items!!");
            return;
        }

        System.out.print("Values is: ");
        while (curr != null) {
            System.out.print(curr.getItem() + "\t");
            prev = curr;
            curr = curr.getLink();
        }
    }
}
