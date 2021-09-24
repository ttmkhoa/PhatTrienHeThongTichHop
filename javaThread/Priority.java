//package javaThread;

public class Priority extends Thread {
	int sleep;
	int prio = 3;

	public Priority() {
		sleep += 100;
		prio++;
		setPriority(prio);
	}

	public void run() {
		try {
			Thread.sleep(sleep);
			System.out.println("Name: " + getName() + ". Priority = " + getPriority());
		} catch (InterruptedException inex) {
			System.out.println(inex.getMessage());
		}
	}
}
