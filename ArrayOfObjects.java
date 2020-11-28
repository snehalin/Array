
public class ArrayOfObjects {
public static void main(String args[])
{
	Employee e1=new Employee(101,"Mushtaque",10000);
	
	Employee emp[]=new Employee[5];//Array of Object
	emp[0]=e1;
	emp[1]=new Employee(106,"Ajamali",10000);
	emp[2]=new Employee(108,"Anuradha",5000);
	emp[3]=new Employee(103,"Kanchan",80000);
	emp[4]=new Employee(1088,"Komal",12000);
	
	for(int i=0;i<emp.length;i++)
	 System.out.println(emp[i]);
	
	
	
	Employee LargeEmp=emp[0];
	for(int i=1;i<emp.length;i++)
	{
		if(emp[i].getSalary()>LargeEmp.getSalary())
			LargeEmp=emp[i];
		
	}
	System.out.println("Large Salary Record="+LargeEmp);
	
	System.out.println("Records in ascending order of eid");
	
	for(int i=0;i<emp.length;i++)
	{
		for(int j=0;j<emp.length-i-1;j++)
		{
			if(emp[j].getEid()>emp[j+1].getEid())
			{
				Employee temp=emp[j];
				emp[j]=emp[j+1];
				emp[j+1]=temp;
				
			}
		}
	}
	
	for(int i=0;i<emp.length;i++)
		 System.out.println(emp[i]);
	
	
	
	
	
}
}
