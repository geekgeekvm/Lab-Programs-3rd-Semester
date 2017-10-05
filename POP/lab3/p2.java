//convert number from decimal to binary

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class p2{
	public static void main(String[] args) throws IOException{
		BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a decimal number");
		String[] buff=s.readLine().split(" ");
		int n=Integer.parseInt(buff[0]);
		int[] binary= new int[20];
		int k=0;
		while(n!=0){
			binary[k]=n%2;
			n=n/2;
			k++;

		}
		for(int i=0,j=binary.length-1;i<binary.length/2;i++,j--){
				int temp=binary[i];
				binary[i]=binary[j];
				binary[j]=temp;
		}

		System.out.print("Binary number is: ");
		for(int i=0; i<binary.length;i++)
			System.out.print(binary[i]);

	}
}