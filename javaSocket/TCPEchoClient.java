import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPEchoClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("127.0.0.1", 6789);
            System.out.println("CLIENT da duoc tao");

            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();

            for (int i = '0'; i <= '9'; i++) {
                os.write(i);

                int ch = is.read();
                System.out.println((char) ch);

                Thread.sleep(2000);
            }

            if (s != null) {
                s.close();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
