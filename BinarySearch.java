
public class BinarySearch {

	public static void main(String[] args) {
		//ascending
		/*  10  20  23  45  50  
		     0  1   2    3   4
		 l=0,r=4
		   mid=(l+r)/2=2
		   
		   if(a[mid]==key)  23==45
		   {
		   }
		   if(key>a[mid])//45>23
		   {
		    l=mid+1                 l=3,r=4,
		   }
		   else
		   {
		   r=mid-1
		   }
		   
		   
		   
		   mid=(l+r)/2=(3+4)/2=3
		   
		    if(a[mid]==key)  45==45
		   { 
		    
		   }
		   if(key>a[mid])//45>23
		   {
		    l=mid+1                 l=3,r=4,
		   }
		   else
		   {
		   r=mid-1
		   }
		  	   
		   */
		int a[]= {10,20,30,40,50,60,70};
		
		int l,r,mid=0,flag=1,key,cmp=0;
		l=0;
		r=a.length-1;
		key=60;
		while(l<=r)// l=4,r=6
		{ 
			cmp++;
			mid=(l+r)/2;       //4+6/2=5
			if(a[mid]==key)  //a[5]=40==60
            { 
				flag=2;
				break;
		     }
			else if(key>a[mid])
			{
				l=mid+1;  //l=4
			}
			else
			{
				r=mid-1; // r=-1
			}
			
		}
		if(flag==2)
		{
			System.out.println("Element is found at possition"+mid
					+"  comparision="+cmp);
		}
		else
		{
			System.out.println("Element not found"+" comparisions="+cmp);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
