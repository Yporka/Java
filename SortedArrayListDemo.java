import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedArrayListDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(7);
        numbers.add(23);
        numbers.add(74);
        numbers.add(19);

        Collections.sort(numbers);

        System.out.println("Отсортированный список: " + numbers);
    }
}



