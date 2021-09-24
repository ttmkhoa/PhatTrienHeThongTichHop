//package javaStream;

import java.io.*;

public class tesst {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("D:/HocJava/javaStream/src/javaStream/outData.txt");

            byte[] by = new byte[] { 'H', 'E', 'L', 'L', 'O' };

            for (int i = 0; i < by.length; i++) {
                byte b = by[i];
                os.write(b);
            }

            os.close();

            /*
             * InputStream is = new
             * FileInputStream("D:/HocJava/javaStream/src/javaStream/data.txt");
             * 
             * int i = -1;
             * 
             * while((i = is.read()) != -1){ System.out.println(i + " " + (char)i); }
             * is.close();
             */
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}