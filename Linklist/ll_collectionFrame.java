import java.util.LinkedList;
public class ll_collectionFrame {
    public static void main(String[] args) {

           // CREATE
        LinkedList<Integer>ll = new LinkedList<>();

        // ADD IN LINKLIST
        ll.addFirst(1);
        ll.addFirst(0);
        ll.addLast(2);
        ll.addLast(3);
        System.out.println(ll);

        // REMOVE IN LINKLIST
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);

    }
}
