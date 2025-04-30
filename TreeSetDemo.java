import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(20);
        set.add(10);
        set.add(40);
        set.add(30);
        set.add(50);

        for (Integer number : set) {
            System.out.println(number);
        }
    }
}
