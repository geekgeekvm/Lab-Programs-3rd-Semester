import java.util.*;
class Area
{
	public double area(int r, int l)
	{
		return Math.round(3.14*r*l);
	}

	public double area(int r, double h)
	{
		return Math.round(2*3.14*r*h);
	}

	public double area(int a, int b, int c)
	{
		return Math.round(2*(a*b + b*c + c*a));
	}

	public double area(int a)
	{
		return Math.round(a*a*6);
	}
}

 public class p6
{
	public static void main(String args[])
	{
		Area x = new Area();
		System.out.println("Area of cone = "+x.area(5,8));
		System.out.println("Area of cylinder = "+x.area(5,8.0));
		System.out.println("Area of cube= "+x.area(5));
		System.out.println("Area of cuboid = "+x.area(8,5,3));
	}
}