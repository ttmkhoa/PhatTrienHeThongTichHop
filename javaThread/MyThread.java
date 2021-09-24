//package javaThread;

public class MyThread extends Thread {
	String name;// ten thread
	int n;// so lan thread xuat hien ra man hinh

	MyThread(String name, int n) {// khoi tao, gan gia tri cho 2 thuoc tinh
									// goi start() de cho thread hoạt động (start()tu dong run())
		this.name = name;
		this.n = n;
		System.out.println(name + " has been created...");
		start();
	}

	public void run() {// In n dong thong bao ra man hinh roi ket thuc thread.
		try {
			for (int i = 0; i < n; i++) {
				System.out.println("Hello, I am " + name);
				// System.out.println("\tI go to bed now. bye!bye!!" + name);
				Thread.sleep(1500);
			}
		} catch (InterruptedException inex) {
			System.out.println("current thread interupted");
		}
	}

	public static void main(String[] args) {
		// int n = 1000;
		// int nt = 4;

		// for (int i = 0; i < nt; i++) {
		// MyThread t = new MyThread("Thread: " + i, n);

		// }
	}
}
