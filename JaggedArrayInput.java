import java.util.Scanner;

public class JaggedArrayInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many rows you wants");
		int rows=sc.nextInt();
		int a[][]=new int[rows][];
		
		for(int i=0;i<rows;i++)
		{
			System.out.println("Enter no. of cols for"+i+" array");
		int col	=sc.nextInt();
			a[i]=new int[col];
		}
		
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter "+a[i].length+"Elements");
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}

		System.out.println("Elements of 2D array are:\n");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
