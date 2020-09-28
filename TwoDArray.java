//Array of array
//int a[];
//int a[][];
//a=new int[3][];jagged array//
//a[0]=new int[5];
//a[1]=new int[4];
//a[2]=new int [6];
 /*     0 1 2 3
      0 1 2 3 4
      1 1 2 3 6
      2 5 6 8 8
      
      a[0][0]=1;
      a[0][1]=2;
      a[1][3]=6;
      a[2][1]=6;
      a[2][3]=8;
      
      int a[]={1,2,34};
      int a[][]={
                  {1, 2, 3 ,4,5},
                  {1, 2, 3, 6},
                  {5, 6, 8, 7,8,9}
                  
                };
  */
public class TwoDArray {

	public static void main(String[] args) {
		int a[][];
		a=new int[3][3];
		a[0][0]=10;
		a[0][1]=20;       // 10 20 30
		a[0][2]=30;       // 10 20 30
		a[1][0]=10;       // 11 12 13
		a[1][1]=20;       
		a[1][2]=30;
		a[2][0]=11;
		a[2][1]=22;       
		a[2][2]=33;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
           System.out.println();
		}
		
		int b[][]= {
				{1,2,3,4,5},  //b[0]
				{2,3,4,5},  //b[1]
				{1,2,3,4,5,6}
		};
			System.out.println("b.length="+b.length);	
			
				
			for(int i=0;i<b.length;i++)
			{
				for	(int j=0;j<b[i].length;j++)
				{
					System.out.print(b[i][j]+" ");
				}
		System.out.println();
			}
		
		
		
		

	}

}
