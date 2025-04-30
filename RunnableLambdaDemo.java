public class RunnableLambdaDemo {
    public static void main(String[] args) {
        Runnable task1 = () -> System.out.println("Task 1 is running");
        Runnable task2 = () -> System.out.println("Task 2 is running");
        Runnable task3 = () -> System.out.println("Task 3 is running");

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All tasks completed");
    }
}