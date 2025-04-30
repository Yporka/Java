import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("One");
        list.add("Two");
        list.add("Free");
        list.add("Four");

        list.addFirst("Zero");
        list.addLast("Five");

        list.removeFirst();
        list.removeLast();

        for (String number : list) {
            System.out.println(number);
        }
    }
}
