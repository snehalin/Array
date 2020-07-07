
public class Employees {

	private int empid;
	private String name;
	private double salary;
	
	public Employees(int empid, String name, double salary) {
		//super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	

	@Override
	public String toString() {
		return "Employees [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
	
 //classname objectname=new classname();
		//new Employees();
		Employees e1=new Employees(1,"amit",20000);
		Employees[] emp=new Employees[3];//memory allocation
	 emp[0]=e1;
	 emp[1]=new Employees(3,"amar",50000);
	 emp[2]=new Employees(2,"sumit",40000);
	 
	 System.out.println("Before Sorting");
	 for(int i=0;i<emp.length;i++)
	 {
		 System.out.println(emp[i]);
	 }
	//sorting according to salary
	 for(int i=0;i<emp.length;i++)
	 {
		for(int j=i+1;j<emp.length;j++)
		{
			if(emp[i].salary<emp[j].salary)
			{
			//salary
					/*
					 * double temp=emp[i].salary; emp[i].salary=emp[j].salary; emp[j].salary=temp;
					 * 
					 * //name String t=emp[i].name; emp[i].name=emp[j].name; emp[j].name=t;
					 * 
					 * //id
					 * 
					 * int tem=emp[i].empid; emp[i].empid=emp[j].empid; emp[j].empid=tem;
					 */
				
			Employees temp=emp[i];
			emp[i]=emp[j];
			emp[j]=temp;
			}
			
				
		}
	 
	 
	 }
		System.out.println("After Sorting");
	 for(int i=0;i<emp.length;i++)
	 {
		 System.out.println(emp[i]);
	 }
		
		}
		
		
	}


