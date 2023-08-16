public class ThreadPriorityEx extends Thread{
	public static void main(String[] args){
		ThreadPriorityEx t1=new ThreadPriorityEx();
		ThreadPriorityEx t2=new ThreadPriorityEx();
		ThreadPriorityEx t3=new ThreadPriorityEx();
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Thread X Priority= "+t1.getPriority());
		System.out.println("Thread Y Priority= "+t2.getPriority());
		System.out.println("Thread Z Priority= "+t3.getPriority());
		t1.setPriority(4);
		t2.setPriority(6);
		t3.setPriority(8);
		System.out.println("After Setting Priority");
		System.out.println("Thread X Priority= "+t1.getPriority());
		System.out.println("Thread Y Priority= "+t2.getPriority());
		System.out.println("Thread Z Priority= "+t3.getPriority());
	}
}