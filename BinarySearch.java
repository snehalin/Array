//0   1  2  3  4  5
//11 13 15 17 18 19
/* l    m         r
 while(l<=r){
  mid=(l+r)/2   =5                     l     r      mid   a[mid]  key
  if(a[mid]==key)                     0     5      2      15      19
  sysout(found) 
  break                               3     5      4      18      19
  if(key>a[mid])  //right                   5      5      5       19     19
     l=mid+1
   else 
     r=mid-1;//left
     }
 */
public class BinarySearch {

	public static void main(String[] args)  {

		int a[]= {11 ,13, 15, 17, 18, 19};
		int key=5;
		int l=0,r=a.length-1;     //cnt=2  l=0  r=-1 mid=0 a[mid]=11 key=5
		int cnt=0;
		boolean flag=false;
		while(l<=r)
		{cnt++;
			int mid=(l+r)/2;
			if(a[mid]==key)
			{flag=true;
				System.out.println("Element found at "+(mid+1)+" position"+
			        " Comparisions="+cnt);
				break;
			}
			else if(key>a[mid])//right
				l=mid+1;
			else       //left
				r=mid-1;
		}
		if(flag==false)
		{
			System.out.println("Element not found"+ " Comparisions="+cnt);
		}
		
		
		
		
	}

}
