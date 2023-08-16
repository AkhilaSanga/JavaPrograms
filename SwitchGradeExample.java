import java.util.Scanner;
public class SwitchGradeExample{
	public static void main(String[] args){
		int count,i;
		float totalmarks=0, percentage, average;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number of Subjects: ");
		count =sc.nextInt();
		System.out.print("Enter Marks of "+count+" Subject: ");
		
		for(i=0;i<count;i++){
			totalmarks +=sc.nextInt();
		}
		System.out.println("Total Marks: "+totalmarks);
		percentage=(totalmarks/(count*100))*100;
		
		switch((int)percentage/10){
			case 9: System.out.println("Grade: A+");
			break;
			case 8: System.out.println("Grade: A");
			break;
			case 7: System.out.println("Grade: B");
			break;
			case 6: System.out.println("Grade: C");
			break;
			case 5: System.out.println("Grade: D");
			break;
			case 4: System.out.println("Grade: E");
			break;
			default: System.out.println("Grade: F");
			break;
		}
	}
}