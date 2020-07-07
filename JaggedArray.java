import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		int a[][]= {
				{1,2},
				{1,2,3,4},
				{1,2,3,4,5}
				
				
		};
		
		int b[][]=new int[3][];//Jagged
		b[0]=new int[2];
		b[1]=new int[4];
		b[2]=new int[5];
		
		b[0][0]=1;
		b[0][1]=2;
		//b[0][2]=3; Exception
		b[1][0]=1;
		b[1][1]=2;
		b[1][2]=3;
		b[1][3]=4;
		
		b[2][0]=1;
		b[2][1]=2;
		b[2][2]=3;
		b[2][3]=4;
		b[2][4]=5;
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row size");
		int row=sc.nextInt();
		
		int c[][]=new int[row][];
		
		for(int i=0;i<row;i++)
		{
			System.out.println("Enter column");
		int	col=sc.nextInt();
		c[i]=new int[col];
			System.out.println("Enter "+col+" Elements");
			for(int j=0;j<c[i].length;j++)
			{
				c[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Elements are");
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
