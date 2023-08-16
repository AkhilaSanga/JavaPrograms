import java.util.Scanner;
public class SwitchDejiscis{
	public static void main(String[] args){
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		name=sc.nextLine(); 
		switch(name.length()){
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10: System.out.println("Length is 5-10");
			break;
			default: System.out.println("Length not in 5-10");
		}
	}
}