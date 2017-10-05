import java.util.Scanner;
class intrst
{
	public void intrst(double p, double r, double t)
	{
		int i=1;
		double a;
		while (i<=t)
		{
			a = p*(Math.pow((1+(r/1200)), 12*i));
			double q = Math.round( a * 100.0 ) / 100.0;
			System.out.println("  "+i+"\t  "+q);
			p = a;
			i+=1;
		}
	}
}

public class p2
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the principal amount: ");
		double p = s.nextDouble();
		System.out.println("Enter the rate percentage: ");
		double r = s.nextDouble();
		System.out.println("Enter no. of years: ");
		double t = s.nextDouble();
		System.out.println("Years\tFutureValue");
		intrst j = new intrst();
		j.intrst(p,r,t);
	}
}