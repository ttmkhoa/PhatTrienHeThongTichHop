package javaStream;

import java.io.*;
public class PrintString {
	public static void main(String[] args) {
		OutputStream os = System.out;
		PrintWriter pw = new PrintWriter(os);
		pw.write("this is a string \r\n");
		pw.println("this is a line");
		pw.write("Bye!Bye!");
		pw.flush();
	}
}
