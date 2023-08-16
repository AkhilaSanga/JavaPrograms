import java.util.Scanner;
public class TernaryOPeratorExample{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Time: ");
		int time=sc.nextInt();
		String result= (time<18)?"Good Morning":"Good Evening";
		System.out.println(result);
	}
}