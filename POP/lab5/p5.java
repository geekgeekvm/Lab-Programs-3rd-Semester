import java.util.*;
class Area
{
	public double area(int a, int b)
	{
		return Math.round(3.14*a*(a+b));
	}

	public double area(int a, double b)
	{
		return Math.round(2*3.14*a*(a+b));
	}

	public double area(int a, int b, int c)
	{
		return Math.round(2*(a*b + b*c + c*a));
	}

	public double area(double a, int b)
	{
		return Math.round(2*b*(Math.sqrt((b*b)+(a*a))) + (b*b));
	}

	public double area(int a)
	{
		return Math.round(3*3.14*a*a);
	}
}

 public class p5
{
	public static void main(String args[])
	{
		Area x = new Area();
		System.out.println("Area of cone = "+x.area(5,8));
		System.out.println("Area of cylinder = "+x.area(5,8.0));
		System.out.println("Area of rectangular prism = "+x.area(5,8,3));
		System.out.println("Area of pyramid = "+x.area(8.0,5));
		System.out.println("Area of hemisphere = "+x.area(5));
	}
}
