package linked_list;

import linked_list.model.ListNode;

public class LinkedList {

    ListNode head;

    public static LinkedList _instance = new LinkedList();

    public static LinkedList getInstance(){
        return _instance;
    }

    public void push(int value){
        ListNode newListNode = new ListNode(value);
        if(head == null) {
            head = newListNode;
        }
        else {
            newListNode.setNext(head);
            head = newListNode;
        }
    }

    public LinkedList createSampleLinkedList(){
         push(1);
         push(2);
         push(3);
         push(4);
         push(5);
         return this;
    }
    public String toString(){
        ListNode start = head;
        String res = "LinkedList is - ";
        while (start != null){
            res = res  + " " + start.getValue() + " ";
            start = start.getNext();
        }
        return res;
    }

}
