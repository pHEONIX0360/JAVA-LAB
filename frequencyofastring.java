import java.util.Scanner;
public class Frequencyofastring {

	public static void main(String[] args) {
		Scanner  in = new Scanner(System.in);
  String str1;
  char ch;
  int len,count,j;
  count=0;
  int i;
  System.out.println("Enter the String \t");
  str1 = new String();
  str1=in.nextLine();import java.util.Scanner;

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

  System.out.println("Enter the character whos frequency is to be tested:\t");
  ch = in.next().charAt(0);
  len=str1.length();
  for( i=0;i<len;i++)
  
  {
	if(ch == str1.charAt(i))
	{
		count++;
	}
	
  }
 
if (count==0)
{
	System.out.println("Element not found");
	
}
else 

 
  System.out.println("The character repeats \t"+count+"\ttimes");
  
	}
		
  
	}

