import java.util.Scanner;

public class AdditionTwoD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows and cols");
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		
		int a[][]=new int[rows][cols];
		int b[][]=new int[rows][cols];
		int c[][]=new int[rows][cols];

		System.out.println("Enter "+(rows*cols)+"elements for a arrays");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter "+(rows*cols)+"elements for b arrays");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
	
		
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			c[i][j]=a[i][j]+b[i][j];
		}
	}
	System.out.println("Elements of a are");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("Elements of b are");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			System.out.print(b[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("Elements of c are");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
	}

}
