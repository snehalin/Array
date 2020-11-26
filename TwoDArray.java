//Array-> 1D  Multidiamensional 
/*datatype arrayname[][]=new datatype[rowsize][colsize];
 * 
 int a[][]=new int[3][3];
  0  1  2  3
0 10 20 30 11        --a[0]
1 40 50 60 12        --a[1]
2 70 80 90 13        --a[2]
 a[0][0]=10
 a[0][1]=20
 a[0][2]=30
 a[2][1]=80
 syout(a[0][0])
 */
public class TwoDArray {

	public static void main(String[] args) {
		/*int a[][]=new int[3][4];//matrix
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		a[2][1]=80;
		a[0][3]=11;*/
		int b[][]=new int[3][];//JaggedArray
		b[0]=new int[5];
		b[1]=new int[4];
		b[2]=new int[6];
		
		b[0][0]=1;
		b[0][1]=1;
		b[0][2]=1;
		b[0][3]=1;
		b[0][4]=1;

		b[1][0]=2;
		b[1][1]=2;
		b[1][2]=2;
		b[1][3]=2;
		
		b[2][0]=3;
		b[2][1]=3;
		b[2][2]=3;
		b[2][3]=3;
		b[2][4]=3;
		b[2][5]=3;
		
		int a[][]= {
				{10,20,30,11},//JaggedArray
				{40,50,60},       //a[1][3]
				{70,80}
		};
		System.out.println("Lenghth="+a.length);
		for(int i=0;i<a.length;i++)//row
		{
			for(int j=0;j<a[i].length;j++)//column
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("----B Array Contents-----");
		for(int i=0;i<b.length;i++)//row
		{
			for(int j=0;j<b[i].length;j++)//column
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

}
