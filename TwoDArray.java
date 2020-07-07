import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		//Array of Array
		int a[]=new int[3];
		a[0]=10;
		int b[]= {2,3,4,5,6};
		
		//System.out.println(a[0]);
		
		int arr[][]=new int[3][4];
		//datatype arrayname[][]=new datatype[row][col];

		/*  0   1  2  3
		 0	10 20 30 40
		 1	50 60 70 80
		 2	90 11 12 13 		 */
		arr[0][0]=10;
		arr[0][1]=20;
		arr[1][1]=60;
		arr[2][1]=11;
		
		int c[][]= {
				 { 10,20,30,40}, //c[0]
				 {50,60,70,80}, //c[1]
				 {90,11,12,13}   //c[2]
				
		            };
		//System.out.println(c[0].length);
	      for(int i=0;i<c.length;i++)
	      {
	    	  for(int j=0;j<c[i].length;j++)
	    	  {
	    		System.out.print(c[i][j]+" ");  
	    	  }
	    	  System.out.println();
	      }
	   //User input
	      
	      Scanner sc=new Scanner(System.in);
	     
	      
	      System.out.println("Enter row and col size");
	      int row=sc.nextInt();
	      int col=sc.nextInt();
	      int d[][]=new int[row][col];
	      System.out.println("Enter"+ (row*col)+"Element");
	      for(int i=0;i<row;i++)
	      {
	    	  for(int j=0;j<col;j++)
	    	  {
	    		  d[i][j]=sc.nextInt();
	    	  }
	    	  
	      }
	      
	      System.out.println("Elements are");
	      
	      for(int i=0;i<row;i++)
	      {
	    	  for(int j=0;j<col;j++)
	    	  {
	    		System.out.print(d[i][j]+" ");  
	    	  }
	      System.out.println();
	      } 
	      
	      //using for each
	    System.out.println("Using for each loop");  
	      for(int x[]:d)
	      { 
	    	  for(int y:x)
	    	  {
	    		  System.out.print(y+" ");
	    	  }
	    	  System.out.println();
	      }
	      
		
		
		
		
		}
		
	}


