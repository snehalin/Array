
public class UserDefinedExceptionDemo {

	public static void main(String[] args) throws InvalidAgeException {
	
		int age=17;
		if(age<18)
		{
			//generate InvalidException
			throw new InvalidAgeException("U r not eligible for voting,Try next Year!!!");
		}
		System.out.println("Welcome ,U are Eligible for Voting");

	}

}
