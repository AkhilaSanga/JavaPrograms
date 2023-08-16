class thisDemo3{
	int a;
	int b;
	thisDemo3(){
		this(10,20);
	}
	thisDemo3(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
	}
	public static void main(String[] args){
		thisDemo3 object=new thisDemo3();
	}
}