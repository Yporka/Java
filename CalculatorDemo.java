public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        int result = add.operate(7, 10);
        System.out.println("Сумма: " + result);
    }
}