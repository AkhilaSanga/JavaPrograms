class A implements Runnable{
	int token=1;
	public void run(){
		synchronized (this){
			System.out.println(token+"...alloted to "+Thread.currentThread().getName());
			token++;
		}
	}
}
class SynchroBlock{
	public static void main(String[] args){
		A a1=new A();
		Thread t1=new Thread(a1);
		Thread t2=new Thread(a1);
		Thread t3=new Thread(a1);
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t1.start();
		t2.start();
		t3.start();
	}
}