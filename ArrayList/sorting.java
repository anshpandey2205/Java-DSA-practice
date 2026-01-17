import java.util.*;
public class sorting {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();

        list.add(5);
        list.add(4);
        list.add(8);
        list.add(9);
        list.add(1);
        list.add(18);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        // DESCENDING ORDER

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

    }
}
