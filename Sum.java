
public class Sum {

	public static void main(String[] args) {
		int a[]= {100,101,102,103};
System.out.println(a[0]+a[1]+a[2]+a[3]);

int sum=0;
 for(int i=0;i<a.length;i++)
 {
	sum=sum+a[i]; //0+a[0]=0+100=100
 }                //100+a[1]=100+101=201     

System.out.println("Sum="+sum);

	}

}
