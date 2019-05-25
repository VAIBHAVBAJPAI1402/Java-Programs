import java.util.Scanner;

class DivideByZeroException extends Exception
{
	public String toString()
	{
		return("Divide by zero exception");
	}
}
public class Exp7prog4 {
	static void checkDenominator(float d) throws DivideByZeroException
	{
		if(d==0.0f)
			throw new DivideByZeroException();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numerator :");
		float num=sc.nextFloat();
		System.out.println("Enter denominator :");
		float den=sc.nextFloat();
		try
		{
			checkDenominator(den);
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		float result=num/den;
		System.out.println("Result = "+result);
	}

}
