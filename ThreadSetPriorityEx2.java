public class ThreadSetPriorityEx2 extends Thread{
	public void run(){
		System.out.println("Priority of thread is: "+Thread.currentThread().getPriority());
	}
	public static void main(String[] args){
		ThreadSetPriorityEx2 t1=new ThreadSetPriorityEx2();
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
	}
}