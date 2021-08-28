package javaStream;
import java.io.*;
public class InStream2 {
	public static void main(String[] args) {
		InputStream is = System.in;
		while(true) {
			try {
				int num = is.available();
				if(num > 0) {
					byte[] b = new byte[num];
					int result = is.read(b);
					if(result == -1) break;
					String s = new String(b);
					System.out.print(s);
				}else {
					System.out.print('.');
				}
			}catch(IOException ie) {
				System.out.println("Error: "+ie);
			}
		}
	}
}
