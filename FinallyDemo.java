
/*
 try
 {stmts...
 }
 finally
 {
 stmts...
 }
 
 
 
 2)
 try
 {stmts...
 }
 catch(Exception e)
 {
 stmts..
 }
 finally
 {
 stmts..
 }
 
 Finally block executes when
 exception occured,not occured,handled,or not handled,it always gets excetuted
 
 Finally block not get executed when
 1.System.exit(0)
 2.Infine loop
 3.return stmt
  executed before finally
 
 
 
 
 */
public class FinallyDemo {

	static int method1()
	{
		if(10<12)
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
		try
		{
			System.out.println("hii");
			method1();
			//System.exit(0);
			/*for(int i=0;i<3;i--)
			{
				System.out.println(i);
			}*/
			int a=10/0;
			System.out.println("bye");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
		//	file.close();
			//con.close();
			System.out.println("Finally Block");
		}
		
		
		
		System.out.println("hello");
		try
		{
			System.out.println("hii");
			int a=10/0;
			System.out.println("bye");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally Block");
		}

	}

}
