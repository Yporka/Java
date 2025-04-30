import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple");
        set.add("Banana");

        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
