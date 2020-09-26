import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int a[]=new int [5];
      System.out.println("Enter 5 numbers");
      Scanner sc=new Scanner(System.in);
      /*
		a[0]=sc.nextInt();
		a[1]=sc.nextInt();
		a[2]=sc.nextInt();*/
      
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
      
      for(int i=0;i<a.length;i++)
      {
    	  if(a[i]%2==0)
       		  System.out.println("Even no="+a[i]); 
       	  else
    		  System.out.println("odd no="+a[i]);  
      }
      
      
      
      
      
      
	}

}
