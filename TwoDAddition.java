
public class TwoDAddition {

	public static void main(String[] args) {
		int a[][]= {
				{1,1,1,1},
				{1,1,1,1},
				{1,1,1,1}
		};
		
		int b[][]= {
				{11,12,13,14},
				{1,1,1,1},
				{1,1,1,1}
		};
		
		
		int c[][]=new int[3][4];
		
		//c[0][0]=a[0][0]+b[0][0];
		//c[0][1]=a[0][1]+b[0][1];
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
			c[i][j]=a[i][j]+b[i][j];	
			}
		}
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
