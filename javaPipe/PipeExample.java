//package javaPipe;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipeExample {
    public static void main(String[] args) {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        try {
            pis.connect(pos);

            pos.write(65);
            pos.write(66);
            pos.write(67);

            System.out.println("Use of available(): " + pis.available());

            pis.close();
        } catch (IOException e) {

            e.printStackTrace();
        }

    }
}
