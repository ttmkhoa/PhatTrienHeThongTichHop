package javaThread;

//
public class MyThread extends Thread{
	String name;//ten thread
	int n;//so lan thread xuat hien ra man hinh
	
	MyThread(String name, int n){//khoi tai, gan gia tri cho 2 thuoc tinh 
								//goi start() de cho thread hoạt động (start()tu dong run())
		this.name = name;	
		this.n = n;			
		System.out.println(name+" has been created...");
		start();
	}
	
	public void run() {//In n dong thong bao ra man hinh roi ket thuc thread.
		try {
			for (int i=0; i<n; i++)
			{
				System.out.println("Hello, I am " + name);
				System.out.println("\tI go to bed now. bye!bye!!");
				Thread.sleep(1500);
			}
		}catch(InterruptedException inex) {
			System.out.println("current thread interupted");
		}
	}
	public static void main(String[] args) {
//		Tao ra 4 thread thuoc tinh MyThread lan luot co ten la Thread0, Thread1, Thread2, Thread3. 
//		Moi thread co 1000 lan xuat hien ra man hinh
		
		int n= 100;
		int nt = 4;
		
		Thread mt = Thread.currentThread();
		mt.setName("MyThread");
		System.out.println("Main thread name is now: " + mt);
		System.out.println("========================");
		
		for(int i=0; i<nt; i++) {
			MyThread t = new MyThread("Thread: "+ i, n);
			
		}
	}
}
