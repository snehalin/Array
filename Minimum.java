
public class Minimum {

	public static void main(String[] args) {
		       //0   1 2 
		int a[]= {7 ,
				};
        int small=a[0];//7
        int large=a[0];
        for(int i=1;i<a.length;i++)// 
        {   // System.out.println("i= "+i+" small= "+small);
        	if(a[i]<small)
        	{
        		small=a[i];   
        	}
        	if(a[i]>large)
        	{
        		large=a[i];
        	}
        }
        System.out.println("Smallest Element="+small+"\n Largest="+large);
	}

}
