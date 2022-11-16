class Employee
{
 String Name;
 int Age;
 int Phone_number;
 String Address;
 double Salary;
 
 Employee(String Name,int Age,int Phone_number,String Address,double Salary)
 {
  this.Name=Name;
  this.Age=Age;
  this.Phone_number=Phone_number;
  this.Address=Address;
  this.Salary=Salary;
 }
 
 void printSalary()
 {
  System.out.println("Salary is "+Salary);
 }j
}

class Officer extends Employee
{
 String Specialization;
 
 Officer(String Name,int Age,int Phone_number,String Address,double Salary,String Specialization)
 {
  super(Name,Age,Phone_number,Address,Salary);
  this.Specialization=Specialization;
 }
}


class Manager extends Employee
{
 String Department;
 
 Manager(String Name,int Age,int Phone_number,String Address,double Salary,String Department)
 {
  super(Name,Age,Phone_number,Address,Salary);
  this.Department=Department;
 }
}


class HierarchicalInheritenceEmployee
{
 public static void main(String args[])
  {
   Officer obj1 = new Officer("joe",64,6832378,"Kottayam",346700.0,"Mapping");
   obj1.printSalary();
   
   Manager obj2 = new Manager("mathew",47,467468,"Pala",5690304,"code");
   obj2.printSalary();
  }
}
