import java.io.FileNotFoundException;
import java.io.FileReader;

//throws->> multiple exceptions at time throw towards calling method or jvm
//mainly designed to throw checked Exceptions 

 /*
  void m1() throws Exception1,Exception2....
  {
  }
  */
public class ThrowsDemo {

	static void m1() throws FileNotFoundException ,ClassNotFoundException
	{
		int a=10/0;
	FileReader fr=new FileReader("d:/abc.txt");
	 throw new ClassNotFoundException();	
	}
	
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
		
		m1();
		System.out.println("hello");
	}

}
