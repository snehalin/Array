//Array-:It is collection of similar data type elements
/*

datatype arrayname[];
arrayname=new datatype[size];
int rollno[];
rollno=new int[5];

rollno[0]=10;
rollno[1]=20;




*/
public class ArrayDemo {

	public static void main(String[] args) {
		int rollno[];
		//int rollno1[5]; error
		rollno=new int[5];

		rollno[0]=10;
		rollno[1]=20;
		
	/*	
		System.out.println(rollno[0]);
		System.out.println(rollno[1]);
		System.out.println(rollno[2]);
		System.out.println(rollno[3]);
		System.out.println(rollno[4]);
		*/
		
		for(int i=0;i<5;i++)
		{
			System.out.println(rollno[i]);	
		}
		
		double marks[]=new double[10];
	//	double []marks=new double[10];
	//double[] marks=new double[10];
		
		int arr[]= {10,20,30,40,50};
		int arr1[]=new int[] {10,20,30,4,5};
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]+"is present at location"+i);
		}
		
		
		
		
		
		
		
	}

}
