import java.util.*;

class InsuffuicientFunds extends Exception{
InsuffuicientFunds(String msg){
super(msg);
}

}
class InvalidAmt extends Exception{
InvalidAmt(String msg){
super(msg);
}
}
class Bankexception{
String name;
int age;
int user ;
int accountNumber;
int balance;
void CustomerDetails(String name,int age,int accountNumber) {
this.name=name;
this.accountNumber=accountNumber;
}
void print() {
System.out.println("Name :"+name);
System.out.println("Age :"+age);
System.out.println("Account Number :"+accountNumber);
}

void deposit(int amount) throws  InsuffuicientFunds , InvalidAmt{
if(amount<0) {
throw new InvalidAmt("Invalid negative amount");
}
else {
balance=balance+amount;
System.out.println("Your current balance is"+balance);
}
}
void withdraw(int amount) throws  InsuffuicientFunds , InvalidAmt{
if(amount<0) {
throw new InvalidAmt("Invalid negative amount");
}
else if(balance<amount) {
throw new InvalidAmt("Insufficient fund ");
}
balance=balance-amount;
System.out.println("Your balance is "+balance);
}

}

public class Bank extends Bankexception{
public static void main(String[] args) throws InsuffuicientFunds {
Scanner sc=new Scanner(System.in);
int opt2;
int gmg=0;
int fog;

System.out.println("***Welcome to Axis Bank***");

System.out.println("Enter the number of Accounts to be created");
int size=sc.nextInt();
String name;
int age;
int accountNumber;
Bank b[];
b=new Bank[size];
for(int i=0;i<b.length;i++) {
System.out.println("Enter the name of costumer");
name=sc.next();
       name+=sc.nextLine();
    
System.out.println("Enter  age..");
age=sc.nextInt();
System.out.println("Name Costumer"+(i+1)+":"+name);
System.out.println("Age:"+age);
if(age<=18)
{
	System.out.println("**Minor unable to open an account**");
	
}
else
{
System.out.println("Enter the account Number of the customer");
}
accountNumber=sc.nextInt();
b[i]=new Bank();
b[i].CustomerDetails(name,age,accountNumber);
}

do {
int user = 0;




System.out.println("Enter 1 for Depositing money to your account \nEnter 2 for Withdrawal of money from the BANK\nEnter 3 for printing the details of all users");
opt2=sc.nextInt();


switch(opt2) {
case 0:
System.out.println("Enter the account number");
int accountNumberCheck=sc.nextInt();
for(int i=0;i<b.length;i++) {
if(b[i].accountNumber==accountNumberCheck) {
user=i;
break;
}
else {
System.out.println("enter a valid account number");
}
}
break;
case 1:

System.out.println("Enter the amount");
int amount=sc.nextInt();
try {
b[user].deposit(amount);
}
catch(InvalidAmt e) {
System.out.println(e);
}
break;
case 2:
int amount1;
System.out.println("Enter the amount");
amount1=sc.nextInt();

try {
b[user].withdraw(amount1);
}
catch(InvalidAmt e) {
System.out.println(e);
}
catch(InsuffuicientFunds m) {
System.out.println(m);
}
break;
case 3:
for(int j=0;j<b.length;j++)
{
	
b[j].print();
}

break;
default:
System.out.println("Enter a valid input");
}




System.out.println("Enter 1 to continue 0 to exit");
fog=sc.nextInt();
}while(fog==1);
}
}
