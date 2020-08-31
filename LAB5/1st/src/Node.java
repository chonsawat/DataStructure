public class Node {
    private String item;
    private Node link;

    // constructors
    // head node
    public Node() {
        link = null;
    }


    // last node
    public Node(String newItem) {
        item = newItem;
        link = null;
    }
    public Node(String newItem, Node nextNode) {
        item = newItem;
        link = nextNode;
    }


    // begin method
    public void setItem(String newItem) {
        item = newItem;
    }
    public String getItem() {
        return item;
    }
    public void setLink(Node nextNode) {
        link = nextNode;
    }
    public Node getLink() {
        return link;
    }
}