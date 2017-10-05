import java.util.Scanner;

public class p1{
public static void main(String[] args){
	System.out.println("Enter operands:");
	Scanner s = new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	System.out.println("Enter: \n1. Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Modulus\n");
	int i=s.nextInt();
	if(i==1)
		System.out.println(a+b);
	else if(i==2)
		System.out.println(a-b);
	else if(i==3)
		System.out.println(a*b);
	else if(i==4)
		System.out.println(a/b);
	else if(i==5)
		System.out.println(a%b);
	else
		System.out.println("Enter valid operation");
}
}