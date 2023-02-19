
import java.util.*;
class main
{
    public static void main(String[] args)
    {
        String str,rev="";
        int length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sting");
        str=sc.nextLine();
         length =str.length();
         for( int i=length-1;i>=0;i--)
         {
             rev=rev+str.charAt(i);
         }
         if(str.equals(rev))
         {
             System.out.println("Palindrome");
         }
         else
         {
             System.out.println("The given string is not palindrome");
         }
    }
}
