import java.util.Scanner;
public class Arraycheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int roll[]=new int[10];
		String name[]=new String[10];
		
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Enter student info =");
				roll[i]=sc.nextInt();
				name[i]=sc.nextLine();
			}
			System.out.println("Enter index =");
			int val=sc.nextInt();
			if(val<0 || val>10)
				throw new ArrayIndexOutOfBoundException();
			for(int i=0;i<10;i++)
			{
				System.out.println("Roll : "+roll[i]+" Name : "+name[i]);
			}
		}
		catch(ArrayIndexOutOfBoundException e)
		{
			System.out.println("Array index is out of bound");
		}
	}

}
