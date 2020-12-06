
public class RuntimeStackMechanismDemo {

	static void m1()
	{System.out.println("m1 Starts");
	m2();
	//try {m2();}catch(Exception e) {System.out.println(e);}
		System.out.println("m1 ends");
	}
	static void m2()
	{
		System.out.println("m2 Starts");
		int a=10/0;
		//try {int a=10/0;}catch(Exception e) {System.out.println(e);}
		System.out.println("m2 ends");
	}
	
	public static void main(String[] args) {
		System.out.println("main Starts");
		try {m1();}catch(Exception e) {System.out.println(e);}
		System.out.println("main ends");
	}

}



