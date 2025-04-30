import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Alex", 85);
        studentScores.put("Artem", 63);
        studentScores.put("Ksenia", 87);
        studentScores.put("Igor", 71);

        int threshold = 75;
        System.out.println("Студенты с баллом выше " + threshold + ":");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            if (entry.getValue() > threshold) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }
    }
}
