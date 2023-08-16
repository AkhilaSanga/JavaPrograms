public class ThreadSetPriorityEx1 extends Thread{
	public void run(){
		System.out.println("Priority of thread is: "+Thread.currentThread().getPriority());
	}
	public static void main(String[] args){
		ThreadSetPriorityEx1 t1=new ThreadSetPriorityEx1();
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
	}
}