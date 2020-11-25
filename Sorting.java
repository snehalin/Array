//Selection Sort
/*
 0 1 2 3 4
 5 4 8 2 3
 2 4 8 5 3  pass 1
 2 3 8 5 4  pass 2
 2 3 4 5 8  pass 3
 2 3 4 5 8  pass 4
 2 3 4 5 8
 */
public class Sorting {

	public static void main(String args[])
	{           //0 1 2 3 4
		int a[]= {5,4,8,2,3,17,23,10};
	for(int i=0;i<a.length-1;i++)
	{
		int smallindex=i;               //smallindex=3   j=4
		for(int j=i+1;j<a.length;j++)
		{    // 2 <5
		   if(a[j]<a[i])
		       {
			   if(a[j]<a[smallindex])
			       smallindex=j;  //smallindex=3
	           }
		}
		//swapping  a[i] and a[smallindex]
		int t=a[i];
		a[i]=a[smallindex];
		a[smallindex]=t;
		
}
	for(int x:a)
	{
		System.out.print(x+" ");
	}
}
}