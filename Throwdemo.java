import java.io.FileNotFoundException;

//throw---> Exception Generates
//Use to throw User Defined Exception
/*
  throw ThrowableInstance;
  eg.
  throw new FileNotFoundException();
  throws exception towards calling method() or jvm
  
  
 */
public class Throwdemo {

static	void m1()
	{
		throw new ArithmeticException();
	}
	
	
	public static void main(String[] args) {
		/*try {
			throw new FileNotFoundException();
				}
		catch(Exception e)
		{
			System.out.println(e);
		}*/
		
		
       try {
		m1();
       }
       catch(Exception e)
       {
    	   System.out.println(e);
       }
       System.out.println("hello");
	}

}
