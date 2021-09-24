
public class SynchronizedDemo {
    public static void main(String[] args) {
        LopA a = new LopA();
        new LopB(a, "The gioi").start();
        new LopB(a, "Dong vat").start();
        new LopB(a, "Hoang Da").start();

    }
}