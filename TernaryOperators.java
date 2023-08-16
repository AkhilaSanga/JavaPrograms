import java.util.Scanner;
class TernaryOperators{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		System.out.print("Enter your marks: ");
		double marks=input.nextDouble();
		String result=(marks>40)?"pass":"fail";
		System.out.println("You "+result+" the exam");
		input.close();
	}
} 