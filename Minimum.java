
public class Minimum {

	public static void main(String[] args) {
		
		int arr[]= {20,4,6,1,89,8};
		
		int smallest=arr[0];//20
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}
		
		System.out.println("Smallest="+smallest);
	}

}
