import java.util.Scanner;

public class TransposeMatrix {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no of rows and cols");
	int rows=sc.nextInt();
	int cols=sc.nextInt();
	
	int a[][]=new int[rows][cols];
	int b[][]=new int[cols][rows];
	

	System.out.println("Enter "+(rows*cols)+"elements for a arrays");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	
	/*
	 1 1 1 1 
	 2 20 2 9
	 31 3 3 13
	 
	 1 2 31
	 1 20 3
	 1 2 3
	 1 9 13
	 */
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
		   b[j][i]=a[i][j];
		}
	}
	
	System.out.println("elements of a array are");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	
	
	System.out.println("Tranposition of a array is");
	for(int i=0;i<b.length;i++)
	{
		for(int j=0;j<b[i].length;j++)
		{
			System.out.print(b[i][j]+" ");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
}
}
