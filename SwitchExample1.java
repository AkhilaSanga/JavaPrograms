import java.util.Scanner;
public class SwitchExample1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your choice: ");
		int ch=sc.nextInt();
		switch(ch){
			case 1: System.out.println("One");
			case 2: System.out.println("Two");
			case 3: System.out.println("Three");
			default: System.out.println("Not in 1,2 or3");
		}
	}
}