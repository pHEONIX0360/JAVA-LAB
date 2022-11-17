import java.util.Scanner;


public class Menudriven {
	

	static void Test(int a,int b)
	{
		if(b!=0)
		{
			System.out.println("Result is"+a/b);
			
		}
		else 
		{
			System.out.println("Divison by zero not possible");
			
		}
	}

	public static void main(String[] args) {
	Scanner in= new Scanner(System.in);
	System.out.println("Enter the first number:");
	int a=in.nextInt();
	System.out.println("a="+a);
	System.out.println("Enter the second number:");
	int b=in.nextInt();
	System.out.println("b="+b);
	System.out.println("\t**Division Operation**\t");
	System.out.println(+a+"/"+b);
	try
	{
	Test(a,b);
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}

	}

}
