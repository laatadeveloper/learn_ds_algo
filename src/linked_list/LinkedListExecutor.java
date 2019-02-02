package linked_list;

public class LinkedListExecutor {

    public static void execute(){
        LinkedList linkedList = LinkedList.getInstance().createSampleLinkedList();
        LinkedList linkedList1 = new LinkedList();
        linkedList1.push(1);
        linkedList1.push(3);
        linkedList1.push(5);
        linkedList1.push(6);
        System.out.println(linkedList.toString());
        System.out.println(linkedList1.toString());
        UnionIntesectionTwoLinkedList.execute(linkedList, linkedList1);
    }
}
