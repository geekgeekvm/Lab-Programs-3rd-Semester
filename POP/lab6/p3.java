import java.util.Scanner;

class p3{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a decimal value. ");
		int n=s.nextInt();
		String hex="";
		while(n>0){
			int res=n%16;

			if(res==10)
				hex=hex+"A";
			else if(res==11)
				hex=hex+"B";
			else if(res==12)
				hex=hex+"C";
			else if(res==13)
				hex=hex+"D";
			else if(res==14)
				hex=hex+"E";
			else if(res==15)
				hex=hex+"F";
			else
				hex=hex+res;

			n=n/16;

		}
		char[] charArray=hex.toCharArray();
		System.out.println("Hex value is: ");
		for(int i=hex.length()-1; i>=0; i--)
			System.out.printf("%c",charArray[i]);
		System.out.println(" ");
	}
}