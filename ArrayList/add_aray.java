import java.util.ArrayList;

public class add_aray {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        // GET OPERATION

        // int element =list.get(2);
        // System.out.println(element);

        // REMOVE OPERATION

        // list.remove(2);
        // System.out.println(list);

        // SET ELEMENT

        // list.set(2, 15);
        // System.out.println(list);

        System.out.println(list.contains(2));
    }
}