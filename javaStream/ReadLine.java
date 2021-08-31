package javaStream;

import java.io.*;

public class ReadLine {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		while (true) {
			try {
				String line = br.readLine();
				if (line != null)
					System.out.println(line);
			} catch (IOException ie) {
				System.out.println("Error: " + ie);
			}
		}
	}
}
