class ThreadB extends Thread{
	int total;
	public void run(){
		synchronized (this){
			for(int i=0; i<10; i++){
				total +=1;
			}
			notify();
		}
	}
}
public class ThreadA{
	public static void main(String[] args){
		ThreadB b=new ThreadB();
		b.start();
		try{
			System.out.println("waiting for b to complete...");
			b.wait();
		}
		catch(Exception e){
		}
		System.out.println("Total is: "+b.total);
	}
}