public class LopB extends Thread {
    LopA a;
    String s;

    LopB(LopA a, String s) {
        this.a = a;
        this.s = s;
    }

    public void run() {
        a.display(s);
    }
}
