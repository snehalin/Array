
public class Evenodd {
public static void main(String args[])
{
	// 3 7 
	int cnt=0;
	int a[]= {2,1,3, 6,8 ,7 ,9,14,21,42};
	int i=0;
	for( i=0;i<a.length;i++)
	{
		if(a[i]%3==0 && a[i]%7==0)
		{
			cnt++;
			System.out.println(a[i]);
		}
	}
	
	
	System.out.println("total number divided by 3 and 7= "+cnt);
}
}
