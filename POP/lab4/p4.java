import java.util.Scanner;

public class p4{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of both arrays.");
		int m=s.nextInt();
		int n=s.nextInt();
		int[] a = new int[m];
		int[] b = new int[n];
		System.out.println("Enter elements of array 1");
		for(int i=0; i<m; i++)
			a[i]=s.nextInt();
		System.out.println("Enter elements of array 2");
		for(int i=0; i<n; i++)
			b[i]=s.nextInt();
		System.out.println("Common elements are:");
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				if(b[j]==a[i]){
					System.out.println(b[j]);
					break;
				}
			}
		}
	}
}