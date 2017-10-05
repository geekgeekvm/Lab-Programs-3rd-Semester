import java.util.Scanner;

abstract class Customer{
	String name;
	long bid;
	float balance;
	Customer(String n, long b, float bal){
		name=n;
		bid=b;
		balance=bal;
	}
	abstract float Deposit(float d);
	abstract float Withdraw(float w);
}

class Bank extends Customer{
	
	Bank(String n, long b, float bal){
		super(n,b,bal);
		
	}
	float Deposit(float d){
		return balance=balance+d;
	}
	float Withdraw(float w){
		if(w>balance)
			return -1;
		return balance=balance-w;
	}
}

public class p2{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter initial bank balance.");
		float bal=s.nextInt();
		Bank b = new Bank("Vaish",9902595,bal);
		
		System.out.println("Enter: \n1.Deposit \n2.Withdraw");
		int ch=s.nextInt();
		if(ch==1){
			System.out.println("Enter amount to deposit.");
			float dep=s.nextFloat();
			System.out.println("Balance is " + b.Deposit(dep));

		}
		else {
			System.out.println("Enter amount to withdraw.");
			float wit=s.nextFloat();
			if(b.Withdraw(wit)==-1)
				System.out.println("You don't have enough in account.");
			else
				System.out.println("Balance is " + b.Withdraw(wit));

		}
		
		
		
	}
}