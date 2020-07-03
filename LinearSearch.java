import java.util.Scanner;

public class LinearSearch {
public static void main(String args[])
{
	int s;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Total no. of elements");
s=sc.nextInt();
	int a[]=new int[s];
	System.out.println("Enter "+s+" elements");
	for(int i=0;i<a.length;i++)
	{
	a[i]=sc.nextInt();
	}
	
	System.out.println("Elements are:");
	for(int x:a)
	{
		System.out.println(x);
	}
	
	System.out.println("Enter element to be search");
	
	int key=sc.nextInt();
	boolean flag=false;
	int i=0;
	for( i=0;i<a.length;i++)
	{
		if(a[i]==key)
		{
			flag=true;
			break;
		}
	}
	
	if(flag==true)
	{
		System.out.println("element found at location"+(i+1));
	}
	else
	{
		System.out.println("element not found");
}
	
	
}
}
