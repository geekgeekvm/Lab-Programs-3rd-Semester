class Personal{
	String ename;
	double phoneno;
	float basic;
	Personal(String s, double p, float b){
		ename=s;
		phoneno=p;
		basic=b;
	}
}
class Employee extends Personal{
	long eid;
	float commission;
	Employee(String s, double p, float b, long id, float c){
		super(s,p,b);
		this.eid=id;
		this.commission=c;
	}
	float Salary(){
		return basic+commission*basic/100;
	}
}
public class p1{
	public static void main(String[] args){
		Employee e = new Employee("Vaish",9902595,10000,16145,36);
		System.out.println(e.Salary());
	}
}