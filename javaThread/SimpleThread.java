public class SimpleThread extends Thread {

    private String threadName;
    private Thread t;

    SimpleThread(String name) {
        threadName = name;
        System.out.println("Dang tao " + threadName);
        // start();
    }

    @Override
    public void run() {
        System.out.println(threadName + " dang chay");
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println(threadName + " , " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
        System.out.println(threadName + " tam ngung");

    }

    public void start() {
        System.out.println("bat dau luong " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

}
