import java.util.*;
class Employee
{
	public String name;
	public int age;
	Employee(String name,int age)
	{
			this.name=name;
			this.age=age;
	}
	
	public void display()
	{
		System.out.println("Employee Dails are : ");
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
	
}
class NameException extends Exception
{
	public String  toString()
	{	
		return("Name is not correct");
	}
}
class AgeException extends Exception
{	public String toString()
	{	
		return("Age not correct");
	}
}
public class Exp7prog1 {
	
	public static void checkname(String name) throws NameException
	{	
		char[] namearray=name.toCharArray();
		for(int i=0;i<name.length();i++)
		{
			if(Character.isDigit(namearray[i]))
				throw new NameException();
		}
	}
	public static void checkage(int age) throws AgeException
	{
		if(age>50)
		{
			throw new AgeException();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name  :");
		String nameinput=sc.nextLine();
		System.out.println("Enter the age : ");
		int ageinput=sc.nextInt();
		try
		{
			checkname(nameinput);
			try
			{	
				checkage(ageinput);
			}
			catch(AgeException e)
			{
				System.out.println(e.toString());
			}
			
		}
		catch(NameException n)
		{
			System.out.println(n.toString());
		}
		Employee emp=new Employee(nameinput,ageinput);
		emp.display();

	}

}
