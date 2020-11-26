
public class MatrixAddition {

	public static void main(String[] args) {
		int a[][]= {
				
				{1,1,1},
				{1,1,1},
				{1,1,1}
		};

        int b[][]= {
				
				{2,2,2},
				{3,3,3},
				{4,4,4}
		};
        int c[][]=new int [3][3];//0
        
        for(int i=0;i<a.length;i++)
        {
        	for(int j=0;j<a[i].length;j++)
        	{
        		c[i][j]=a[i][j]+b[i][j];
        	}
        }
        
        
     System.out.println("A matrix ");   
        
        for(int i=0;i<a.length;i++)
        {
        	for(int j=0;j<a[i].length;j++)
        	{
        		System.out.print(a[i][j]);
        	}
        	System.out.println();
	}
  System.out.println("B matrix ");   
        
        for(int i=0;i<a.length;i++)
        {
        	for(int j=0;j<a[i].length;j++)
        	{
        		System.out.print(b[i][j]);
        	}
        	System.out.println();
	}
        
        
  System.out.println("C matrix ");   
        
        for(int i=0;i<a.length;i++)
        {
        	for(int j=0;j<a[i].length;j++)
        	{
        		System.out.print(c[i][j]);
        	}
        	System.out.println();
	}
        
	}
}
