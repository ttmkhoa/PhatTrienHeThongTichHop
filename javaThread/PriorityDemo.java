//package javaThread;

public class PriorityDemo {
	Priority t1, t2, t3;

	public PriorityDemo() {
		t1 = new Priority();
		t1.start();

		t2 = new Priority();
		t2.start();

		t3 = new Priority();
		t3.start();
	}

	public static void main(String[] args) {
		new PriorityDemo();
	}

}
