/*

5 4 3 2 1
4 5 3 2 1
4 3 5 2 1
4 3 2 5 1
4 3 2 1 5  pass-I

3 4 2 1
3 2 4 1
3 2 1 4 5  pass-II
2 3 1 4 5
2 1 3 4 5 pass-III
1 2 3 4 5 pass-IV
 */
public class BubbleSort {

	public static void main(String[] args) {
		int a[]= {8,5,3,6,7};
		for(int i=0;i<a.length;i++)
		{ 
			for(int j=0;j<a.length-i-1;j++)    
			{     
				if(a[j]<a[j+1])
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
			
		}
		System.out.println("-------------");
		for(int x:a)
		{
			System.out.print(" "+x);
		}
		
	}

}
