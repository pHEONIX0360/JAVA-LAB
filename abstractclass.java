import java.lang.Math;
abstract class Shape
{
abstract void area();
double area;
}
class Rectangle1 extends Shape
{
double w=22,h=23;
void area()
{
area = w*h;
System.out.println("Area of Rectangle--"+area);
}
}
class Square extends Shape
{
double a=17;
void area()
{
area = (a*a);
System.out.println("Area of Square : "+area);
}
}
class Circle extends Shape
{
double r=9;
void area()
{
area = 3.14*r* r;
System.out.println("Area of Circle : "+area);
}
}
public class abstractclass {

public static void main(String[] args) {
// TODO Auto-generated method stub
   Square sq= new Square();
   Rectangle1 rc =new Rectangle1();
   Circle cr =new Circle();
   sq.area();
   rc.area();
   cr.area();
}

}
