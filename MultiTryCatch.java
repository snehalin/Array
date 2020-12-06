import java.util.Scanner;

public class MultiTryCatch {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4};
		int b=0,c=0;
		System.out.println("start");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index");
		int index=sc.nextInt();
		System.out.println("Enter value for b");
		b=sc.nextInt();
		try {
		c=a[index]/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(NumberFormatException e)//
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("End");
		
		
		
	}

}
