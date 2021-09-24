//package javaPipe;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedEchoClient extends Thread {
    PipedInputStream readPipe;
    PipedOutputStream writePipe;

    PipedEchoClient(PipedInputStream readPipe, PipedOutputStream writePipe) {
        this.readPipe = readPipe;
        this.writePipe = writePipe;
        System.out.println("CLIENT created....");
        start();
    }

    public void run() {
        while (true) {
            try {
                int ch = System.in.read();
                writePipe.write(ch);
                ch = readPipe.read();
                System.out.println((char) ch);
            } catch (IOException ie) {
                System.out.println("Echo client error: " + ie);
            }
        }
    }
}
