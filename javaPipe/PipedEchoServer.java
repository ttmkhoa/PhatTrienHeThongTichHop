package javaPipe;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedEchoServer extends Thread {
    PipedInputStream readPipe;
    PipedOutputStream writePipe;

    PipedEchoServer(PipedInputStream readPipe, PipedOutputStream writePipe) {
        this.readPipe = readPipe;
        this.writePipe = writePipe;
        System.out.println("SERVER is starting....");
        start();
    }

    public void run() {
        while (true) {
            try {
                int ch = readPipe.read();
                ch = Character.toUpperCase((char) ch);
                writePipe.write(ch);
            } catch (IOException ie) {
                System.out.println("Echo server error: " + ie);
            }
        }
    }
}
