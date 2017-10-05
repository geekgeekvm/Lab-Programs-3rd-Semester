import java.util.Scanner;
class Semester{
	int rollNo;
	int marks;
	String name;
	int pointer;
	Semester(int rollNo, int marks, int pointer, String name){
		this.rollNo=rollNo;
		this.marks=marks;
		this.pointer=pointer;
		this.name=name;	
	}
	
	int showPointer(){
		return pointer;			
	}
}

public class p4{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);	
		System.out.println("Enter name of student.");
		String nm=s.nextLine();
		System.out.println("Enter rollno, marks, pointer for first sem.");
		int rn,m,p;
		rn=s.nextInt();
		m=s.nextInt();
		p=s.nextInt();
		Semester s1 = new Semester(rn,m,p,nm);
		System.out.println("Enter rollno, marks, pointer for second sem.");
		rn=s.nextInt();
		m=s.nextInt();
		p=s.nextInt();
		Semester s2 = new Semester(rn,m,p,nm);
		System.out.println("Pointer for first sem is: "+s1.showPointer()+" and for second sem is: "+s2.showPointer());
		
		
	}
}
