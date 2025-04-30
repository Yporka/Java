import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(25);
        deque.addLast(20);
        deque.addFirst(5);
        deque.addLast(10);

        System.out.println("Удалено с начала: " + deque.pollFirst());
        System.out.println("Удалено с конца: " + deque.pollLast());

        System.out.println("Оставшиеся элементы:");
        for (Integer num : deque) {
            System.out.println(num);
        }
    }
}
