import java.util.Scanner;



class Product{
	String product;
	int cost;
	int quantity;
	static int totalQuantity=0;
	static int totalCost=0;
	Product(String p, int c, int q){
		this.product=p;
		this.cost=c;
		this.quantity=q;
		totalQuantity+=q;
		totalCost+=c;
		
	}
	static void showTotal(){
		System.out.println("Total quantity of all products ordered: "+totalQuantity+"\nTotal cost of all products ordered: "+totalCost);
	}
}

public class p1{
	public static void main(String[] args){

		Scanner s = new Scanner(System.in);

		System.out.println("Enter no of products");
		int n=s.nextInt();
		while(n-->0){
			System.out.println("Enter product name, cost and quantity");
			String pn=s.next();
			int c=s.nextInt();
			int q=s.nextInt();
			Product p = new Product(pn,c,q);
			p.showTotal();	
		}
	}
}