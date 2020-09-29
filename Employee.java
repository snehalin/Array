
public class Employee {

	private String name;
private	double salary;
		
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
   
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		Employee e1=new Employee("Amit",10000);
		Employee e2=new Employee("Amar",50000);
		
		//datatype arrayname[]=new datatype[size];
		Employee emp[]=new Employee[3];
		emp[0]=e1;
		emp[1]=e2;
		emp[2]=new Employee("Sumit",20000);
		
		for(int i=0;i<emp.length;i++)
		{
			if(emp[i].getSalary()>=20000)
		 System.out.println(emp[i]);	
		}
	}

}
