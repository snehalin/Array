import java.util.Scanner;

public class Input2D {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter how many rows and columns you wants ");
	int rows=sc.nextInt();
	int cols=sc.nextInt();
		
		int a[][]=new int [rows][cols];
		System.out.println("Enter "+rows*cols+" elements");
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Elements are");
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
		
				System.out.print(a[i][j]+" ");
			}
		System.out.println();
		}
		
		
		
		

	}

}
