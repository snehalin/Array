//try,catch,throw ,throws,finally
/*
          java.lang.Throwable
       Error             Exception
 ex.StackOverflow  IOException   		RuntimeException    SQLException
                	ClassNotFoundExcpn  ArithmeticExcept
                	MethodNotFoundExc   ArrayIndexOutOfBoundsExcpn
                	InterruptedExcpn    NullPointerException
               		FileNotFoundExcepn 	StringIndexOutOfBound
               				
                
 
 try
 {
 exception generating stmts
 }
 catch(Throwable obj)
 {
 //description abt exception
 }
 
  */
public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println("hello");
		try
		{
			System.out.println("hii");
			int a=10/0;
			System.out.println("bye");
		}
		catch(Exception e)//ArithmeticException
		{
			System.out.println(e);//e.toString()
		}
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
	}

}
