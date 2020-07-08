import java.util.Scanner;

public class JaggedArray2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int rows=sc.nextInt();
		int a[][]=new int[rows][];
		
		for(int i=0;i<a.length;i++)//i<rows
		{ 
			System.out.println("Enter no of columns for"+ i+ "row");
			int col=sc.nextInt();
			a[i]=new int[col];
			
			System.out.println("Enter "+(col)+" elements");
			for(int j=0;j<a[i].length;j++)
			{
				
				a[i][j]=sc.nextInt();	
			}
			
		}
		
		
		
		
		System.out.println("Enter no of rows");
		 rows=sc.nextInt();
		int b[][]=new int[rows][];
		
		for(int i=0;i<b.length;i++)//i<rows
		{ 
			System.out.println("Enter no of columns for"+ i+ "row");
			int col=sc.nextInt();
			b[i]=new int[col];
			
			System.out.println("Enter "+(col)+" elements");
			for(int j=0;j<b[i].length;j++)
			{
				
				b[i][j]=sc.nextInt();	
			}
			
		}
		
System.out.println("Elements of a array are");
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
		System.out.println();
			
		}
		
		System.out.println("Elements of b array are");
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
		System.out.println();
			
		}
		
		
	}

}
