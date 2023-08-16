class thisDemo5{
	int a;
	int b;
	thisDemo5(){
		a=10;
		b=20;
	}
	thisDemo5 get(){
		return this;
	}
	void display(){
		System.out.println("a= "+a+" b= "+b);
	}
	public static void main(String[] args){
		thisDemo5 object=new thisDemo5();
		object.get().display();
	}
}