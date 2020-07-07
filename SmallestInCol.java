
public class SmallestInCol {

	public static void main(String[] args) {
		
		int a[][]= {
				{1,20,31},
				{11,2,45},
				{5, 7,8}
		
	            };
		/*0   1  2
		0 {1,20,31},
		1 {11,2,45},
		2 {5, 7,8}
		 
		
		 */
		for(int i=0;i<a.length;i++)
		{
			int smallest=a[0][i];//smallest=20
			for(int j=0;j<a[i].length;j++)
			{
				if(a[j][i]<smallest)//a[2][0]<1  //5<1
				{
					smallest=a[j][i];
				}
			}
			System.out.println("Smallest "+smallest);
			
		}
		
		
		
		
		
		

}
	}
