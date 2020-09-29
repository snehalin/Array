
public class Frequency {

	public static void main(String[] args) {
		int a[]= {1,2,3,1,1,3,2,4};//1->3 2->2 3->2 4->1
		             // 0 0
		
		int t[]=new int[a.length];
		for(int i=0;i<a.length;i++)
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
			 	
			 System.out.println(a[i]+"->"+cnt);
			 }
		    
		}
		
		
		

	}

}
