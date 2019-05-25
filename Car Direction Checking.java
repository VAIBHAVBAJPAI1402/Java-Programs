import java.util.*;
class DirectionException extends Exception
{
	public String toString()
	{
		return("Direction Exception caught");
	}
}
public class Exp7prog2 {
	static void checkDirection(String dir1,String dir2) throws DirectionException
	{
		if(!dir1.equalsIgnoreCase(dir2))
			throw new DirectionException();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter direction of vehicle 1 : ");
		String v1=sc.next();
		System.out.println("Enter direction of vehicle 2 : ");
		String v2=sc.next();
		try
		{
			checkDirection(v1,v2);
		}
		catch(DirectionException e)
		{
			System.out.println(e.toString());
			System.out.println("Possibility of vehicle collision");
			v1=v2;
			System.out.println("New direction - vehicle1: "+v1+" vehicle2: "+v2);
		}
		
		
	}

}
