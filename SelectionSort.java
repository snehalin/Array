import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		int a[]= {7,3,4,5,1,8};
		//1, 3,4,5,7,8
		for(int x:a)
		{
			System.out.println(x);
		}
		
		/*
		 * for(int i=0;i<a.length;i++) { int min=i; for(int j=i+1;j<a.length;j++) {
		 * if(a[j]<a[min]) min=j; } int t=a[i];//a[0]=7 t=7 a[i]=a[min];//a[0]=a[4]
		 * a[0]=1 a[min]=t;//a[4]=7 }
		 */
		
		Arrays.sort(a);
		System.out.println("After sorting:");
		for(int x:a)
		{
			System.out.println(x);
		}
		
		
		
	}

}
