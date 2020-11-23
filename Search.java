import java.util.Scanner;


public class Search {
	public static void main(String[] args) {
	//int a[5];	error
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total number of elements");
		int size=sc.nextInt();
		//int b[]= {1,2,3,456};
	int a[]=new int[size];	
	System.out.println("Enter "+size+" Elements");
	for(int i=0;i<a.length;i++)//input
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Elements are:");
	for(int x:a)//display
	{
     System.out.print(x+" ");
	}
	System.out.println();
	System.out.println("Enter element to be search");
	int key=sc.nextInt();
	
	//11 15 17 19 9 2
	//9
	//Linear Search
	boolean found=false;//flag 
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==key)
		{
			found=true;
		System.out.println(key+"is present at "+(i+1)+" position");
		break;
		}
		
			
	}
	if(found==false)
		System.out.println(key+"is not present  ");
		
	
	
	
	
	
}
}