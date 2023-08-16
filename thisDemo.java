class thisDemo{
	int a;
	int b;
	thisDemo(int a, int b){
		this.a=a;
		this.b=b;
	}
	void display(){
		System.out.println("a= "+a);
		System.out.println("b= "+b);
	}
	public static void main(String[] args){
		thisDemo obj=new thisDemo(10,20);
		obj.display();
	}
}