//package javaThread;

public class MyThread1 extends Thread {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("The current thread is: " + t);
		t.setName("MyJavaThread");
		System.out.println("The thread name is now: " + t);
		try {
			for (int i = 0; i < 3; i++) {
				System.out.println(i);
				Thread.sleep(1500);
			}
		} catch (InterruptedException inex) {
			System.out.println("Main thread interupted");
		}

	}

}
