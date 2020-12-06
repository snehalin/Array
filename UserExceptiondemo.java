
public class UserExceptiondemo {

	public static void main(String[] args) {
		
		int age=17;
		if(age<18)
		{
			throw new InvalidAge("Description");
		}
		
		System.out.println("hello");
	}

}
