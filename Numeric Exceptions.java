import java.util.*;
class NumericException extends Exception
{
	public String toString()
	{
		return("Operand Can only be a numeric value");
	}
}
public class Exp7prog3 {
	static void checkoperand(String op) throws NumericException
	{	char[] digits=op.toCharArray();
		for(int i=0;i<op.length();i++)
		{
			if(!Character.isDigit(digits[i]))
				throw new NumericException();
		}
	}
	public static void main(String args[])
	{
		try
		{
			checkoperand(args[0]);
			try
			{
				checkoperand(args[1]);
			}
			catch(Exception e)
			{
				System.out.println(e.toString());
			}
			
		}
		catch(Exception e1)
		{
			System.out.println(e1.toString());
		}
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		float result=0.0f;
		char[] operator=args[2].toCharArray();
		switch(operator[0])
		{
		case '+':
			result=a+b;
			break;
		case '-':
			result=a-b;
			break;
		case '*':
			result=a*b;
			break;
		case '/':
			result=a/b;
			break;
		default:
			System.out.println("Invalid oprator !");
			
		}
		System.out.println("REsuult is : "+result);
		
	}

}
