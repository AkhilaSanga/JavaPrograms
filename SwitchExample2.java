import java.util.Scanner;
public class SwitchExample2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your choice: ");
		int ch=sc.nextInt();
		switch(ch){
			case 0:
			case 1:
			case 2:
			case 3:
			case 4: System.out.println("Number is less than 5");
					break;
			case 5:
			case 6:
			case 7:
			case 8:
			case 9: System.out.println("Number is less than 10");
					break;
			default : System.out.println("Number is 10 or more");
		}
	}
}