import java.util.Scanner;
public class SwitchExample3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Y or N: ");
		char ch=sc.next().charAt(0);
		switch(ch){
			case 'Y':
			case 'y': System.out.println("You have entered Y.");
					break;
			case 'N':
			case 'n': System.out.println("You have entered N.");
					break;
			default : System.out.println("Incorrect Input");
		}
	}
}