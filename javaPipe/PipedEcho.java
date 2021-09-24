//package javaPipe;

import java.io.*;

public class PipedEcho {
    public static void main(String[] args) {
        try {
            PipedOutputStream cwPipe = new PipedOutputStream();
            PipedInputStream crPipe = new PipedInputStream();

            PipedOutputStream swPipe = new PipedOutputStream(crPipe);
            PipedInputStream srPipe = new PipedInputStream(cwPipe);

            PipedEchoServer server = new PipedEchoServer(srPipe, swPipe);
            PipedEchoClient client = new PipedEchoClient(crPipe, cwPipe);

            server.start();
            client.start();
        } catch (IOException ie) {
            System.out.println("Pipe Echo Error: " + ie);
        }
    }
}
// them chuc nang moi
