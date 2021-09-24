//package javaStream;

import java.io.*;

public class InStream1 {
	public static void main(String args[]) {
		InputStream is = System.in;// keyboard = system.in
		while (true) {
			try {
				int ch = is.read();
				if (ch == -1 || ch == 'q')
					break;
				System.out.println((char) ch);
			} catch (IOException ie) {
				System.out.println("Error: " + ie);
			}
		}
	}
}
