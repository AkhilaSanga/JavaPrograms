import java.util.Scanner;
public class SwitchExample{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your choice: ");
		int num=sc.nextInt();
		switch(num)
		{
			case 1: System.out.println("1");
			break;
			case 2: System.out.println("2");
			break;
			case 3: System.out.println("3");
			break;
			default: System.out.println("Not in 1,2 or 3");
		}
	}
} 