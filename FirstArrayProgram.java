
public class FirstArrayProgram {
public static void main(String args[])
{
	int a;//declaration
	a=10;//Initialization
	int a1=10;
	//System.out.println(a);//display
	
	//datatype arrayname[];
	//arrayname=new datatype[size];
	int b[];//declaration
	b=new int[5];
	int c[]=new int[5];
	
	//System.out.println(c);
	
	//arrayname[index]=value  initialization
	c[0]=11;
	c[1]=25;
	System.out.println(c);	//hashcode
	System.out.println("c.length="+c.length);
	for(int i=0;i<c.length;i++)
	{
		System.out.print(c[i]+" ");
	}
	
	int d[]={11,12,4,2,6,7,21};
	int e[]=new int[] {6,8,3,5};
	System.out.println();
	System.out.println(d.length);
	
	for(int i=0;i<d.length;i++)
	{
		System.out.print(d[i]+" ");
	}
	System.out.println("Using for each");
	//For Each
	//for(datatype variable:arrayname){---}
	for(int x:d)//x=d[i]
	{
		System.out.println(x);
	}
	
	
	
	
	
}
}
