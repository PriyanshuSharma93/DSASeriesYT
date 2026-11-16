package LinkedList;

public class ReverseALinkedList {

    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        return prev;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);

        ReverseALinkedList obj = new ReverseALinkedList();

        ListNode newHead = obj.reverseList(head);

        while(newHead != null){
            System.out.print(newHead.data + " -> ");
            newHead = newHead.next;
        }
    }
}