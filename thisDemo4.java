class thisDemo4{
	int a=12;
	void method1(thisDemo4 obj){
		System.out.println("method1 is invoked");
		System.out.println(obj.a);
	}
	void method2(){
		method1(this);
	}
	public static void main(String[] args){
		thisDemo4 s1=new thisDemo4();
		s1.method2();
	}
}