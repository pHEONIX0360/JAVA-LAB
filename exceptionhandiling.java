import java.util.Scanner;
public class Menudrivenpgm {

String name=null;
public static void main(String[] args ) {
int option;
int check = 0;
int c,number1,number2,number3;
String name=null;
String name2="ALBIN";

int arr[]=new int[3];

Scanner sc=new Scanner(System.in);
do {
System.out.println("press 1 for Arithmatic exception \n 2 for Array out of bond exception \n 3 for NULL pointer exception\n 4 for String IndexOut Of Bounds Exception \n 5 for array format exception");
option=sc.nextInt();
switch(option) {
case 1:
try {
number1=5;
System.out.println("Number one is "+number1);
number2=0;
System.out.println("Number Two is"+number2);
c=number1/number2;
}
catch(ArithmeticException e) {
System.out.println(e+"is not possible");

}
finally {
number1=5;
number2=0;
number3 =1;
c=number1/number3+number2;
System.out.println("The program is free from exception");
System.out.println("Result of number1/number3+number2 is "+c);
}
break;

case 3:
try {
int n=name.length();
System.out.println("length is "+n);
}
catch(NullPointerException e ){
System.out.println(e);
}
finally {
System.out.println("Enter valid names to string to avoid exception");
}
break;
case 2 :
try {
arr[6]=10;

}catch(ArrayIndexOutOfBoundsException e) {
System.out.println(e);
}
finally {
System.out.println("exception is cleared");

}
break;
case 4:
try {


System.out.println("Taking the character at index 6");
System.out.println(name2.charAt(6));
}
catch(StringIndexOutOfBoundsException e) {
System.out.println(e);
}
finally {
System.out.println("Length of array is 4 so use values <4");
System.out.println(name2.charAt(3));
}
break;
default:
System.out.println("enter valid");


}
System.out.println("Enter 1 to continue and 0 to exit");
check=sc.nextInt();
}
while(check==1);

}
private static char charAt(int i) {

return 0;
}
}

