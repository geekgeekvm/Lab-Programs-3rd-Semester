import java.util.Scanner;
public class p2{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=s.nextInt();
		System.out.println("Enter elements");
		int[] a = new int[n];
		int count=0;
		for(int i=0; i<n; i++){
			a[i]=s.nextInt();
			if(a[i]==10)
				count+=10;
		}
		if(count==30)
			System.out.println("True");
		else
			System.out.println("False");

	}
}