public class ThreadExample2 {
    
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("Running thread...");
                System.out.println("Stopping thread...");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
