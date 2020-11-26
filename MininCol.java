
public class MininCol {

	public static void main(String[] args) {
		int a[][]= {
				{4,1,6},//small-a[0][0], a[0][1], a[0][2]
				{1,2,3},//      a[1][0]  a[1][1]
				{6,7,2} //      a[2][0]  a[2][1]
		//		 1 1 2
		};
		
		for(int i=0;i<a.length;i++)
		{
			int small=a[0][i];//small=4
			for(int j=1;j<a[i].length;j++)
			{          // 6  <1
				if(a[j][i]<small)
					small=a[j][i];//small=1
				
			}
			System.out.print(" "+small);
		}
		
		
	}

}
