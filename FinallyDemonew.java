
public class FinallyDemonew {

	
	static int method1()
	{
		if(15<12)
			return 10;
		else
		{
			try {
				System.out.println("try");
			}
			finally
			{
				System.out.println("method finally");
			}
			return 20;
		}
		
	}
	public static void main(String[] args) {
	/*	try
		{
		int a=10/0;
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally Block");
		}
		*/
		System.out.println("hello");
		System.out.println(method1());
	}

}
