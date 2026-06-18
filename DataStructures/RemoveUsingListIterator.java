import java.util.LinkedList;
import java.util.ListIterator;

public class RemoveUsingListIterator {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Original List: " + list);

        ListIterator<Integer> iterator = list.listIterator();

        while (iterator.hasNext()) {
            int value = iterator.next();
            if (value > 30) {
                iterator.remove();
            }
        }

        System.out.println("Updated List: " + list);
    }
}