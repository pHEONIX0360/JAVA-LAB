class Find
{
	int length,width;
	int area(int length,int width)
	{
//		this.length=length;
//		this.width=width;
		System.out.println("Area of rectangle="+length*width);
		return(length*width);
	}

double radius;
double area(double radius)
{
	System.out.println("Area of circle="+3.14*radius*radius);
	return(3.14*radius*radius);
}
int area(int length)
{
	System.out.println("Area of square ="+length*length);
	return(length*length);
	
}
}


public class MethodOverloading {

	public static void main(String[] args) {
		Find obj = new Find();
		obj.area(10,20);
		obj.area(2.1);
		obj.area(5);
		
		

	}
