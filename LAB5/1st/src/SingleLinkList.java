public class SingleLinkList {
    Node newNode;
    Node head;
    Node curr;
    Node prev;

    // การสร้างลิงค์ลิสต์ทางเดียว
    public void add(String newItem) {
        if (head == null) {
            newNode = new Node(newItem);
        } else {
            newNode = new Node(newItem, head);
        }
        head = newNode;
    }


    // การค้นหาข้อมูลบนลิงค์ลิสต์ทางเดียว
    public boolean searchData(String item) {
        curr = new Node();
        prev = new Node();
        curr = head;
        prev = null;
        while (curr != null) {
            if (curr.getItem().equalsIgnoreCase(item)) {
                return true;
            } else {
                prev = curr;
                curr = curr.getLink();
            }
        }
        return false;
    }


    // การลบโหนดในลิงค์ลิสต์ทางเดียว
    public void deleteNode(String item) {
        // ทําการเรียกใช้เมธอด searchData เพื่อค้นหาตําแหน่งที่ต้องการลบ
        if (searchData(item)) {
            //การลบโหนดที่ตําแหน่งแรกของลิงค์ลิสต์
            if (head == curr) {
                head = curr.getLink();
            } else if (curr.getLink() == null) {
            // การลบโหนดที่ตําแหน่งสุดท้ายของลิงค์ลิสต์
                prev.setLink(null);
            } else {
            // การลบโหนดที่อยู่ระหว่างโหนดในลิงค์ลิสต์
                prev.setLink(curr.getLink());
            }
        }
    }


    // การแทรกโหนดเข้าลิงค์ลิสต์ทางเดียว
    public void insertNode(String iteminsert, String newItem) {
        // ทําการสร้างโหนดใหม่ที่จะทําการแทรก
        newNode = new Node(newItem);
        // เรียกเมธอด searchData เพื่อค้นหาตําแหน่งที่ต้องการแทรกโหนด
        if (searchData(iteminsert)) {
            // ทําการแทรกโหนดที่ตําแหน่งแรก
            if (head == curr) {
                newNode.setLink(curr);
                head = newNode;
            } else {
            // ทําการแทรกโหนดเข้าระหว่างโหนดในลิงค์ลิสต์
                newNode.setLink(curr);
                prev.setLink(newNode);
            }
        }
    }


    // การแทรกโหนดเข้าต่อท้ายลิงค์ลิสต์ทางเดียว
    public void insertLastNode(String newItem) {
        // ทําการสร้างโหนดใหม่ที่จะทําการแทรก
        newNode = new Node(newItem);
        // ทําการค้นหาตําแหน่งสุดท้ายของลิงค์ลิสต์
        curr = new Node();
        prev = new Node();
        curr = head;
        prev = null;

        while (curr != null) {
            prev = curr;
            curr = curr.getLink();
        }

        // ทําการอัพเดตค่า Link เพื่อปรับการเชื่อมโยง
        prev.setLink(newNode);
    }


    // การแสดงข้อมูลในลิงค์ลิสต์ทางเดียว
    public void showdata() {
        // ทําการเดินทางไปบนลิงค์ลิสต์ทีละโหนด จนถึงโหนดสุดท้าย
        curr = new Node();
        prev = new Node();
        curr = head;
        prev = null;

        while (curr != null) {
        // เมื่อถึงแต่ละโหนดจะทําการอ่านค่าข้อมูลที่เก็บในโหนดมาแสดง
            System.out.print(curr.getItem() + "\t");
            prev = curr;
            curr = curr.getLink();
        }
    }
}