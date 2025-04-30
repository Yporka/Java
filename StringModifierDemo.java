public class StringModifierDemo {
    public static void main(String[] args) {
        StringModifier modifier = s -> s.toUpperCase() + "!";
        String result = modifier.modify("Hello");
        System.out.printf("Результат: " + result);
    }
}