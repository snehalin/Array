
public class ArrayOfObjects {
public static void main(String args[])
{
	Employee e1=new Employee(101,"xyz",10000);
	Employee e2=new Employee(106,"axyz",110000);
	Employee e3=new Employee(102,"bxyz",210000);
	Employee e4=new Employee(105,"cxyz",12000);
	Employee e5=new Employee(103,"dxyz",710000);
	
	//e1.display();
	System.out.println(e1);//e1.toString()
	e1.setEid(201);
	System.out.println("Eid="+e1.getEid());
}
}
