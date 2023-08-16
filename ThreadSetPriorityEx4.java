public class ThreadSetPriorityEx4 extends Thread{
	public void run(){
		System.out.println("Running...");
	}
	public static void main(String[] args){
		ThreadSetPriorityEx4 t1=new ThreadSetPriorityEx4();
		ThreadSetPriorityEx4 t2=new ThreadSetPriorityEx4();
		t1.setPriority(3);
		t1.setPriority(9);
		System.out.println("Priority of t1 is: "+t1.getPriority());
		System.out.println("Priority of t2 is: "+t2.getPriority());
		t1.start();
	}
}