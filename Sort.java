/*1 5 4 3 2
  1 5 4 3 2
  1 4 5 3 2
  1 4 3 5 2
  1 4 3 2 5 pass-I
  1 4 3 2 
  1 3 4 2
  1 3 2 4 5 passII
  1 3 2
  1 2 3 4 5 passIII
  1 2 3 4 5 pass IV */
  public class Sort {
	  
	public static void main(String[] args) {
	/*	        0 1 2 3 4 
     
		//      4 5 3 2 1
                4 3 5 2 1
                4 3 2 5 1
                4 3 2 1 5 -pass 1
                3 4 2 1 5
                3 2 4 1 5
                3 2 1 4 5 -pass 2 */
		 int a[]= {5,4,3,2,1};
     for(int i=0;i<a.length;i++)   //pass 
     {
    	 for(int j=1;j<a.length-i;j++)
    	 {
    		 if(a[j-1]>a[j])   //i     j 
    		 {                 //2     4
    			 //swap
    			 int t=a[j-1];//  t=5
    			 a[j-1]=a[j]; // a[0]=4
    			 a[j]=t;      // a[1]=5 
    		 }
    	 }
     }
     System.out.println("After sorting");
     for(int i=0;i<a.length;i++)
     System.out.println(a[i]);
      
     
     
    
     
     
     
     
     
     
     
     
	}

}
