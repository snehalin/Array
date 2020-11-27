
public class Transpose {

	public static void main(String[] args) {
		int a[][]= {
				{1,2,3},  //a[0][1]
				{4,5,6},
				{7,8,9}
		};
		/*
		 1 4 7
		 2 5 8   //a[1][0]
		 3 6 9
		 */
		int T[][]=new int[3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				T[i][j]=a[j][i];
				System.out.print(T[i][j]);
			}
			System.out.println();
		}
		
	}

}
