//datatype arrayname[];
//arrayname=new datatype[size];
//or
//datatype arrayname[]=new datatype[size];
/*Array-->It is collection of similar datatype elements
 arrayname[index]=value
 */

public class ArrayDemo {

	public static void main(String[] args) {
	//	int roll1=101,roll2=102,roll3=103,roll4=104,roll5=105;
	/*	int a[]=new int[5];
				a[0]=10	;
				a[2]=30	;
				a[1]=20	;
				a[3]=40	;
				a[4]=50	;*/
		int a[]= {10,20,30,40,50};//size=5
				
				System.out.println(a[0]);
				System.out.println(a[1]);
				System.out.println(a[2]);
				System.out.println(a[3]);
				System.out.println(a[4]);//50
			//	a[5]=60	;
				System.out.println("Using For loop");
				for(int i=0;i<a.length;i++)
				{
					System.out.println(a[i]);
				}
				//
				System.out.println("Using Enhanced /for each loop ");
				for(int i:a)  //x=a[0]..a[4] Array,Collection
				{
					System.out.println(i);
				}

	}

}
