package exceptiontask;

public class NameException 
{
	void Name(String firstname,String lastname) throws RuntimeException
	{
		if(firstname==null && lastname==null)
		{
			throw new NullPointerException("Entry Missing");
		}
		else if(firstname.length()<3 && lastname.length()<3)
		{
			try 
			{
				throw new Exception("Minimum 3 character");
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
