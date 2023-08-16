class InvaildAgeException extends Exception{
	InvaildAgeException(String s){
		super(s);
	}
}
public class TestCustomException1{
	static void validate(int age)throws InvaildAgeException{
		if(age<18)
			throw new InvaildAgeException("not valid");
		else
			System.out.println("Welcome to Vote");
	}
	public static void main(String[] args){
		try{
			validate(20);
		}
		catch(Exception m){
			System.out.println("Exception occured: "+m);
		}
	}
}