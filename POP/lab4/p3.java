import java.util.Scanner;
import java.util.Arrays;
public class p3{

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no. of elements");
		int n = s.nextInt();
		int[] a = new int[n];
		System.out.println("Enter elements:");
		for(int i=0; i<n; i++)			
			a[i] = s.nextInt();
		Arrays.sort(a);
		
		int l=0,sh=1,count,flag=0;		
		
		int i=0;
		do{
			count=1;
			try{
			if(a[i+1]==a[i]+1){
				while(a[i+1]==a[i]+1&&i<n-1){
						count++;
						i++;
				}
			}
			else
				i++;
		} catch(ArrayIndexOutOfBoundsException e){
			
		}
		

			if(count>l)
				l=count;
			if(count<sh)
				sh=count;
		
		} while(i<n-1);
		System.out.println("Longest:"+l+"\nShortest:"+sh);
	}
}
	


