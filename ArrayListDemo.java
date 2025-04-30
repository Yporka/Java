import java.util.ArrayList;
import java.util.List;

 public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.remove(Integer.valueOf(20));

        for (Integer number : list) {
            System.out.println(number);
        }
    }
}
