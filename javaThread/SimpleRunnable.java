public class SimpleRunnable implements Runnable {
    public void run() {
        System.out.println("Luong runnable dang chay");
    }

    public static void main(String[] args) {
        SimpleRunnable r = new SimpleRunnable();
        Thread t = new Thread(r); // ---
        t.start();
    }
}
