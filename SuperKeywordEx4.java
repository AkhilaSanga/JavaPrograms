class Furniture{
	void color(){
		System.out.println("Furniture Color...");
	}
}
class Chair extends Furniture{
	void color(){
		System.out.println("Chair Color: ");
	}
	void heigth(){
		System.out.println("5 ft...");
	}
	void work(){
		super.color();
		heigth();
	}
}
public class SuperKeywordEx4{
	public static void main(String[] args){
		Chair obj=new Chair();
		obj.work();
	}
}