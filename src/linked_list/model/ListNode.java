package linked_list.model;

public class ListNode {
    int value;
    ListNode next;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}
