import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println("Первый элемент : " + queue.peek());

        while (!queue.isEmpty()) {
            System.out.println("Извлеченный элемент: " + queue.poll());
        }
    }
}
