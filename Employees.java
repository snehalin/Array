
public class Employees {

	private int empid;
	private String name;
	private double salary;
	
	public Employees(int empid, String name, double salary) {
		super();
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
		Employees[] emp=new Employees[3];//memory allocation
	 emp[0]=new Employees(1,"amit",20000);
	 emp[1]=new Employees(3,"amar",50000);
	 emp[2]=new Employees(2,"sumit",40000);
	 
	 
	 for(int i=emp.length-1;i>=0;i--)
	 {
		
	 System.out.println(emp[i]);
	 
	 }
		
		
		}
		
		
	}


