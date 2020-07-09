
public class Frequency {

	public static void main(String[] args) {
		
		//Program to find no. of elements which are duplicate and 
		//display its count
		int a[]= {1,2,3,1,4,2,1};
		        //1,2,3,0,4,0,0 
		/*<1,2>
		<1,3>
		<1,4>
		<2,3>
		<2,4>*/
		
System.out.println("Before finding frequency elements in array are");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		//freuency finding
		int i=0;
		for( i=0;i<a.length;i++)
		{
			int cnt=1;
			if(a[i]!=0)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						cnt++;
						a[j]=0;
					
					}
						
			    }
				System.out.println(a[i]+"->"+cnt );
			}
		}
		
		System.out.println("After finding frequency elements in array are");
		
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		//1,2,3,1,2,1,2,4,1
		//1 2,3,0,0,0,0,4,0
		
		for( i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]!=0 && a[j]!=0)
				System.out.println("<"+a[i]+","+a[j]+">");
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
