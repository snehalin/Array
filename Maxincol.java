import java.util.Scanner;

public class Maxincol {

	public static void main(String[] args) {
		
   /*  int a[]= {2,4,8,7};
     
     int max=a[0];
     for(int i=1;i<a.length;i++)
     {
    	 if(a[i]>max)
    		 max=a[i];
     }
     System.out.println("max"+max);*/
     
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
 		
    /*
     1 2 3      a[0][1]
     5 7 9      a[1][1]
     9 3 6      a[2][1]
     */
 		
 		for(int i=0;i<a.length;i++)
 		{int max=a[0][i];
 			for(int j=0;j<a[i].length;j++)
 			{
 				if(a[j][i]>max)
 				{
 					max=a[j][i];
 				}
 			}
 			System.out.println("max="+max);
 		}
 		
     
     
     
     
     
     
     
	}

}
