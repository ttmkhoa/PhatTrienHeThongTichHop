
public class LopA {
    synchronized void display(String s) {
        try {
            System.out.print(" < " + s);
            Thread.sleep(2000);
            System.out.println(" > ");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
