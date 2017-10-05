//perform bitwise shift operations 1.unsigned right shift 2.right shift 3.left shift
//unsigned=>>> and signed=>>

import java.io.*;

public class p4{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		String[] buff=br.readLine().split(" ");
		int x=Integer.parseInt(buff[0]);
		System.out.printf("\nShifting by two bits: \nUnsigned right shift: %d \nRight shift: %d \nLeft shift: %d",x>>>2,x>>2,x<<2);

	}
}