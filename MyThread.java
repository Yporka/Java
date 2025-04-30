public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread " + getName() + " says: Hello from thread!");
    }
}