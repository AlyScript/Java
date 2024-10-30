public class ThreadExample2 {
    
    public static void main(String[] args) {
        Runnable runnable = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " is running.");
        };

        Thread thread = new Thread(runnable, "Thread1");
        thread.start();

        Thread thread2 = new Thread(runnable, "Thread2");
        thread2.start();
    }
}
