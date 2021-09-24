//package javaStream;

import java.io.IOException;

public class test {
    public static void main(String[] args) {
        while (true) {
            try {
                int ch = System.in.read();
                System.out.println("Ky tu " + (char) ch + " co ma ASCII la: " + ch);
            } catch (IOException e) {
                System.out.println("ERROR: " + e);
            }
        }
    }
}