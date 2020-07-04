import java.util.Arrays;

public class PassingArrayArg {
	void demo(int b[])
	{
		
		
		  for(int i=0;i<b.length;i++) { System.out.println(b[i]); }
		 
		
	//	System.out.println(Arrays.toString(b));
	}
	double avg(int a[])
	{
		double sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		
		double average=sum/a.length;
		return average;
	}
	
	int[] addTen(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
		a[i]=a[i]+10;	
		}
		return a;
	}
		public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		PassingArrayArg ob=new PassingArrayArg();
		ob.demo(a);
		double result=ob.avg(a);
		System.out.println("Result="+result);
		a=ob.addTen(a);
		System.out.println(Arrays.toString(a));
	}

}
