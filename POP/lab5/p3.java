import java.util.Scanner;
public class p3{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter element to find index.");
		int x=s.nextInt();
		System.out.println("Enter size of array");
		int n=s.nextInt();
		System.out.println("Enter elements");
		int[] a = new int[n];
		int index=-1;
		for(int i=0; i<n; i++){
			a[i]=s.nextInt();
			if(a[i]==x)
				index=i;
		}
		if (index==-1)
			System.out.println("Not found");
		else
			System.out.println("Index of element is "+index);


		

	}
}