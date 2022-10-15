import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		StringBuffer str1;
		StringBuffer rev;
		int n,length;
		System.out.println("Enter the string");
		str1= new StringBuffer();
		str1=str1.append(in.nextLine());
		rev=new StringBuffer();
		length=str1.length();
		for(int i=0;i<length-1 ;i++)
			
		{
 			rev =rev.append(str1.charAt(i));
 			
		}
		if(rev==str1)
System.out.println("Entered string is palindrome");
		else
			System.out.println("Entered string is  not palindrom");
	}

}
