
public class Frequency {

	public static void main(String[] args) {
	int a[]= {1,2,3,1,3,4,5,2,2,4,6};
	        //1 2 3 0 0 4 5 0 0 0
	//1-->2 2-->3 3-->2 4-->2 5-->1 6-->1
	for(int i=0;i<a.length;i++)  //to check all unique  numbers
		{	
			int cnt=1;
			if(a[i]!=0)
				{
					for(int j=i+1;j<a.length;j++)//to check duplicate elements 
						{
							if(a[j]==a[i])
							{
								cnt++;
								a[j]=0;
							}
		
						}
					System.out.println(a[i]+"--->"+cnt);
				}

	}
}

}
