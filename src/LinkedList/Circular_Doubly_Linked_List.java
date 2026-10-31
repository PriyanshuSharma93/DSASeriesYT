
package LinkedList;

public class Circular_Doubly_Linked_List {

    // ======== DOUBLY CIRCULAR LINKED LIST ===========

    static class Node {
        int data;
        Node previous;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    Circular_Doubly_Linked_List() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // INSERT AT HEAD
    public void insertAtHead(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;

            head.next = head;
            head.previous = head;
        } else {
            newNode.next = head;
            newNode.previous = tail;

            head.previous = newNode;
            tail.next = newNode;

            head = newNode;
        }

        size++;
    }

    // INSERT AT TAIL
    public void insertAtTail(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;

            head.next = head;
            head.previous = head;
        } else {
            newNode.previous = tail;
            newNode.next = head;

            tail.next = newNode;
            head.previous = newNode;

            tail = newNode;
        }

        size++;
    }

    // INSERT AT POSITION
    public void insertAtPosition(int position, int data) {

        if (position < 1 || position > size + 1) {
            System.out.println("Insertion is not possible at this position");
            return;
        }

        if (position == 1) {
            insertAtHead(data);
            return;
        }

        if (position == size + 1) {
            insertAtTail(data);
            return;
        }

        Node newNode = new Node(data);
        Node prevNode = head;

        for (int i = 1; i <= position - 2; i++) {
            prevNode = prevNode.next;
        }

        Node nextNode = prevNode.next;

        newNode.previous = prevNode;
        newNode.next = nextNode;

        prevNode.next = newNode;
        nextNode.previous = newNode;

        size++;
    }

    // PRINT LIST (FORWARD)
    public void printList() {

        if (head == null) {
            System.out.println("LL is empty, cannot print anything");
            return;
        }

        Node current = head;

        do {
            System.out.print(current.data + " <-> ");
            current = current.next;
        } while (current != head);

        System.out.println("(Back to Head)");
    }

    // PRINT LIST (BACKWARD)
    public void printReverse() {

        if (tail == null) {
            System.out.println("LL is empty");
            return;
        }

        Node current = tail;

        do {
            System.out.print(current.data + " <-> ");
            current = current.previous;
        } while (current != tail);

        System.out.println("(Back to Tail)");
    }

    // SEARCH
    public boolean searchLL(int target) {

        if (head == null) {
            System.out.println("No Nodes Inside LL");
            return false;
        }

        Node current = head;

        do {
            if (current.data == target) {
                return true;
            }

            current = current.next;

        } while (current != head);

        return false;
    }

    // DELETE HEAD
    public void deleteHead() {

        if (head == null) {
            System.out.println("LL is empty, cannot delete anything");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            size = 0;
            return;
        }

        Node temp = head;

        head = head.next;

        head.previous = tail;
        tail.next = head;

        temp.next = null;
        temp.previous = null;

        size--;
    }

    // DELETE TAIL
    public void deleteTail() {

        if (head == null) {
            System.out.println("LL is empty, cannot delete anything");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            size = 0;
            return;
        }

        Node temp = tail;

        tail = tail.previous;

        tail.next = head;
        head.previous = tail;

        temp.next = null;
        temp.previous = null;

        size--;
    }

    // DELETE AT POSITION
    public void deleteAtPosition(int position) {

        if (position < 1 || position > size) {
            System.out.println("Deletion is not possible at this position");
            return;
        }

        if (position == 1) {
            deleteHead();
            return;
        }

        if (position == size) {
            deleteTail();
            return;
        }

        Node prevNode = head;

        for (int i = 1; i <= position - 2; i++) {
            prevNode = prevNode.next;
        }

        Node currNode = prevNode.next;
        Node nextNode = currNode.next;

        prevNode.next = nextNode;
        nextNode.previous = prevNode;

        currNode.next = null;
        currNode.previous = null;

        size--;
    }

    // GET SIZE
    public int getSize() {
        return size;
    }

    // MAIN METHOD
    public static void main(String[] args) {

        Circular_Doubly_Linked_List mylist =
                new Circular_Doubly_Linked_List();

        mylist.insertAtHead(20);
        mylist.insertAtHead(10);
        mylist.insertAtTail(40);
        mylist.insertAtPosition(3, 30);

        mylist.printList();
        mylist.printReverse();

        System.out.println("Search 30: " + mylist.searchLL(30));
        System.out.println("Search 100: " + mylist.searchLL(100));

        mylist.deleteHead();
        mylist.printList();

        mylist.deleteTail();
        mylist.printList();

        mylist.deleteAtPosition(2);
        mylist.printList();

        mylist.insertAtTail(100);
        mylist.insertAtTail(200);
        mylist.insertAtTail(300);

        mylist.printList();
        mylist.printReverse();

        System.out.println("Size: " + mylist.getSize());
    }
}
