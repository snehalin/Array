/*
 1 1 1      1 2 3     
 2 2 2  *   4 5 6   
 3 4 5      7 8 9
  A           B
  
 1*1+1*4+1*7  1*2+1*5+1*8    1*3+1*6+1*9  
 2*1+2*4+2*7  2*2+2*5+2*8    2*3+2*6+2*9  
 3*1+4*4+5*7  3*2+4*5+5*8    3*3+4*6+5*9 
 
 12          15            18
  
  
 */
public class Multiplication {

	public static void main(String[] args) {
		int A[][]= {
				{1,1,1},
				{2,2,2},
				{3,4,5}
		};
		int B[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int c[][]=new int[A.length][A.length];
		
		for(int i=0;i<A.length;i++)      //   i=0   j=1   k=3
		{
			for(int j=0;j<A[i].length;j++)
			{
				for(int k=0;k<3;k++)
				{        //12
			//	 c[i][j]=c[i][j]+A[i][k]*B[k][j];
			            // 4+   A[0][2]*B[2][0] 
				       // 4+1*7
				 c[i][j]+=A[i][k]*B[k][j];
				 //a+=1*2;
				 //a=a+1*2
				}
				System.out.print(c[i][j]+" ");
			} 
			System.out.println();
		}
		
	/*	for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		
		}
		*/
		
		
	}

}
