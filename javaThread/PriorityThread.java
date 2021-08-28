package javaThread;

//tao 12 thread trong lop MyThread
//mang prio chua do uu tien tu cao toi thap
public class PriorityThread{
	public static void main(String args[]){
		int n = 10;        
		int nt = 12;         
		int prio[]= {Thread.MAX_PRIORITY, Thread.NORM_PRIORITY, Thread.MIN_PRIORITY};
		for (int i=0; i<nt; i++){ 
			MyThread t = new MyThread("Thread"+i,n);           
			t.setPriority(prio[i%3]);   //thread thu i co do uu tien o vi tri thu i%3 trong mang prio --> 0 3 6 9 -> 1 4 7 10 -> 2 5 8 11    
		}
		}
}
