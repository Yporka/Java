import java.util.Arrays;

public class LambdaArraySortDemo {
    public static void main(String[] args) {
            String[] words = {"Java", "Lambda", "Stream", "API"};
            Arrays.sort(words, (s1, s2) -> s1.length() - s2.length());

            System.out.println("Сортировка по длине: " + Arrays.toString(words));
        }
    }