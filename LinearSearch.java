import java.util.Scanner;

public class LinearSearch {

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
	      
	      //10 20 30 40 50
	      //key=40
	      //if(key==a[0])
	      int temp=0;
	      for(int i=0;i<a.length;i++)
	      {
	    	  if(a[i]==key)
	    	  {temp++;
	    		  System.out.println("Element is present at index"+i);
	    		  break;
	    	  }
	    	  
	      }
	      if(temp==0)
	      {
	    	  System.out.println("Element not found");
	      }
	      
	      
	      
	        
	      
	      
	      

	}

}
