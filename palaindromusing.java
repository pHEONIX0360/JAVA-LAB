import java.util.Scanner;

public class Palindromusingstringhandilingfunct {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String str1,rev="";
		int n,length;
		System.out.println("Enter the string");
		
		str1=in.nextLine();
		
		length=str1.length();
	
		for(int i=0;i<length;i++)
			
		{
 			rev =rev+str1.charAt(i);
 			
		}
		
		if(str1.equals(rev)==true)
		{
			System.out.println("It is palindrome"); 
		}
		else
		{
			System.out.println("Its is not palindrome");
			
		}

}
}
