public class ThreadDemo {
    public static void main(String[] args) {
        SimpleThread t1 = new SimpleThread("dhcntt15A");
        t1.start();

        SimpleThread t2 = new SimpleThread("dhcntt15B");
        t2.start();

    }
}
