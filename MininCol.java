
public class MininCol {

	public static void main(String[] args) {
		int a[][]= {
			//   0 1 2	
				{4,1,6},//0 small-a[0][0], a[0][1], a[0][2]
				{1,2,3},//1       a[1][0]  a[1][1]  a[1][2]
				{6,7,2} //2       a[2][0]  a[2][1]  a[2][2]
		//		 1 1 2
		};
		
		for(int i=0;i<3;i++)// i=2
		{
			int small=a[0][i];//small=6
			int large=a[i][0];
			for(int j=1;j<3;j++)
			{      //    2  <3
				if(a[j][i]<small)
					small=a[j][i];//small=2
				if(a[i][j]>large)
					large=a[i][j];
				
			}
			
			System.out.println("Small="+small+"Large"+large);
		}
		
		
	}

}
