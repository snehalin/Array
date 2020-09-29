
public class PassingArrayArg {

	void display(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	int[] method()
	{
		int c[]= {11,12,13,14};
		return c;
	}
	
	
	
	
	public static void main(String[] args) {
		int b[]= {1,2,3,4,5,6};
		PassingArrayArg obj=new PassingArrayArg();
		obj.display(b);//b[] or b
       int x[]= obj.method();//b=obj.method();
       obj.display(x);
	}

}
