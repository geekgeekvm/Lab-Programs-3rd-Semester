import java.util.Scanner;
class Payroll{
	String dept;
	double base;
	double totalSal;

	public Payroll(String dept){
		this.dept=dept;

	}

	public void calcBase(){
		if(dept.equals("IT"))
			base=10000;
		else if(dept.equals("HR"))
			base=7000;
		else if(dept.equals("RD"))
			base=1000;
		else if(dept.equals("EE"))
			base=5000;
		else
			base=-1;
	}

	public double totalSal(){
		calcBase();
		if (base==-1)
			return -1;
		totalSal=base+0.15*base;
		return totalSal;

	}


}

public class p5{
	public static void main(String[] args){
		String d;
		System.out.println("Enter dept (IT,HR,RD,EE)");
		Scanner s = new Scanner(System.in);
		d=s.nextLine();
		Payroll p = new Payroll(d);
		double sal=p.totalSal();
		if(sal==-1){
			System.out.println("Wrong dept entered");
		}
		else
			System.out.println(sal);

	}
}