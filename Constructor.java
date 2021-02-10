package task1;

class Employee
{
	String FirstName;
	String LastName;
	
	@Override
	public String toString()
	{
		return "Employee FirstName=" + FirstName + ", LastName=" + LastName ;
	}
	public Employee(String firstName, String lastName) 
	{
		super();
		this.FirstName = firstName;
		this.LastName = lastName;
	}
	void display()
	{
		System.out.println("First Name: "+FirstName);
		System.out.println("Last Name: "+LastName);
	}
}
public class Constructor
{
	public static void main(String[] args)
	{
		Employee emp1=new Employee("Jaylakshmi", "Rajeevan");
		Employee emp2=new Employee("Anupama", "R");
		Employee emp3=new Employee("Vani", "R");
		emp1.display();
		emp2.display();
		emp3.display();
	}
}
