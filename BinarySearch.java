import java.util.Scanner;

//Elements must be sorted ie ascending order
/* 
 * 
   0   1    2  3     4
   11  13  56  79   90
   
   mid=(0+4)/2=4/2=2
   
   if(a[mid]==key)
   {
     sysout
   }
   if(key>a[mid])
     search in right part  
    else
     search in left part 
   
*/
public class BinarySearch {

	public static void main(String[] args) {
    
		int a[]=new int [5];
	      System.out.println("Enter 5 numbers");
	      Scanner sc=new Scanner(System.in);
	     
	      
	      for(int i=0;i<a.length;i++)
	      {
	    	  a[i]=sc.nextInt();  
	      }
		
	      System.out.println("Elements of array are");
	      for(int i=0;i<a.length;i++)
	      {
	      System.out.println("a["+i+"]="+a[i]);//a[0]=10
	      }
	      
	      System.out.println("_____________________");
	      
	      System.out.println("Enter Element to be search");
	      int key=sc.nextInt();
                                            //0  1   2 	3  4
	      									//10 20 30  40 50
	      int l,r;                            
	                                     //    l     r    mid   a[mid]  key
	      l=0;                           //   0      -1     0     10      11
	      r=4;
	      int temp=0;
	      int cnt=0;
	      while(l<=r)
	      {
	    	  cnt++;
	         int mid=(l+r)/2;
	      
	         if(key==a[mid])    //11==10
	         {
	        	 System.out.println("Element is present"+mid+"position "
	        	 		+ "and comparisions="+cnt);
	        	 temp++;
	        	 break;
	         }
	         if(key>a[mid])   //11>10
	         {
	        	l=mid+1; 
	         }
	         else
	         {
	        	r=mid-1; 
	         }
	      
	      }
	      if(temp==0)
	      {
	    	  System.out.println("Element not found"+"and comparisions="+cnt);
	      }
	     
	     
	     
	     
	     
		

	}

}
