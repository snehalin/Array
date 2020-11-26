import java.util.Scanner;

public class Input2DArray {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter row and col size");
	int row=sc.nextInt();
	int col=sc.nextInt();
	int a[][]=new int[row][col];
	
	System.out.println("Enter "+(row*col)+" Elements");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	System.out.println("Elements are-----");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("Elements are using enhanced for loop-----");
	
	
	for(int y[]:a)//y=a[0]..a[1]
	{
			for(int x:y)//x=a[1][0]..a[1][1]..a[1][2]
			{
							System.out.print(x+" ");
			}
	System.out.println();
	}
	
}
}
