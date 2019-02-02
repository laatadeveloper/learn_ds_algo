package linked_list;

import linked_list.model.ListNode;

import java.util.HashSet;

public class UnionIntesectionTwoLinkedList {

    public static void execute(LinkedList linkedList1, LinkedList linkedList2){
        ListNode head1 = linkedList1.head;
        ListNode head2 = linkedList2.head;
        ListNode start = head1;
        ListNode dummy1 = new ListNode(-1);
        ListNode headUnion = dummy1;
        HashSet<Integer> set = new HashSet<>();
        while(start!=null){
            if(!set.contains(start.getValue())){
                headUnion.setNext(start);
                headUnion = start;
                set.add(start.getValue());
            }
            start = start.getNext();
        }
        start = head2;
        while(start!=null){
            if(!set.contains(start.getValue())){
                headUnion.setNext(start);
                headUnion = start;
                set.add(start.getValue());
            }
            start = start.getNext();
        }
        headUnion.setNext(null);
        headUnion = dummy1.getNext();
        LinkedList unionList = new LinkedList();
        unionList.head = headUnion;
        System.out.println(unionList.toString());
    }
}
