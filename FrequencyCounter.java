import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Apple", "Orange", "Banana", "Apple"};
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String fruit : fruits) {
            frequencyMap.put(fruit, frequencyMap.getOrDefault(fruit, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
