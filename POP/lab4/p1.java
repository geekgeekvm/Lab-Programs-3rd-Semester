import java.util.Scanner;

public class p1{
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	System.out.println("Enter 3 numbers.");
	int a = s.nextInt();
	int b = s.nextInt();
	int c = s.nextInt();

	if(a>b&&b>c)
		System.out.println("Decreasing");
	else if (a<b&&b<c)
		System.out.println("Increasing");
	else
		System.out.println("Neither increasing nor decreasing.");
	}

}