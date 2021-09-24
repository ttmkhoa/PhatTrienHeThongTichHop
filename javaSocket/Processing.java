import java.net.Socket;
import java.io.*;

public class Processing extends Thread {
    Socket s;

    public Processing(Socket s) {
        this.s = s;
    }

    public void run() {
        try {
            OutputStream os = s.getOutputStream();
            InputStream is = s.getInputStream();
            while (true) {
                int n = is.read();
                System.out.println((char) n);
                if (n == -1)
                    break;
                os.write(n);
                //
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
