public class ThreadExample {

    public static class MyThread extends Thread {
        public void run() {
            System.out.println("MyThread Running");
            System.out.println("MyThread Finished");
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}