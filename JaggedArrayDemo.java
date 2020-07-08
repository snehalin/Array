import java.util.Scanner;

public class JaggedArrayDemo {

	public static void main(String[] args) {
//2D Array of Array
		int a[]= {1,2,3,4};//1D array
		int b[]= {10,20,30};
		int c[]= {100,200,300,400,500};
		
		int d[][]=new int[3][3];//matrix
		int e[][]=new int[3][];//jaggedArray

		//1st way
		e[0]=a;
		//2nd way
		e[1]=new int[4];
		e[1][0]=10;
		e[1][1]=20;
		e[1][2]=30;
		
		//3rd way
		int f[][]= {
				{1,2,3},       //f[0]
				{10,20,30,40},//f[1]
				{100,200,300,400,500} //f[2]
		           };
		System.out.println("elements are");
		for(int i=0;i<f.length;i++)
		{
			for(int j=0;j<f[i].length;j++)
			{
				System.out.print(f[i][j]+" ");
			}
			System.out.println();
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows and columns");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		
		System.out.println("Enter "+(row*col)+" elements");
		
		for(int i=0;i<row;i++)//i<arr.length
		{
			for(int j=0;j<col;j++)//j<arr[i].length
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("elements are");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
