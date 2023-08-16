public class ThreadSetPriorityEx3 extends Thread{
	public void run(){
		System.out.println("Priority of thread is: "+Thread.currentThread().getPriority());
	}
	public static void main(String[] args){
		ThreadSetPriorityEx3 t1=new ThreadSetPriorityEx3();
		t1.setPriority(Thread.NORM_PRIORITY);
		t1.start();
	}
}