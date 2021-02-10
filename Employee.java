package exceptiontask;

public class Employee extends RuntimeException
{
	private String firstname;
	private String lastname;
	public Employee(String firstname, String lastname)
	{
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}
}
