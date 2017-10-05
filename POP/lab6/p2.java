import java.util.Scanner;

class Book{
	String name;
	String genre;
	int cost;
	int quantity;
	static int totalBooks;
	static{
		totalBooks=0;
	}
	Book(String b, String g, int c, int q){
		name=b;
		genre=g;
		cost=c;
		quantity=q;
		totalBooks+=q;
	}
	static void showTotal(){
		
		System.out.println("Total no of books in library are " + totalBooks);
	}
}
public class p2{
	public static void main(String[] args){

		Scanner s = new Scanner(System.in);

		System.out.println("Enter no of books");
		int n=s.nextInt();
		while(n-->0){
			System.out.println("Enter book name, genre, cost and quantity");
			String pn=s.next();
			String gn=s.next();
			int c=s.nextInt();
			int q=s.nextInt();
			Book b = new Book(pn,gn,c,q);
			b.showTotal();	
		}
	}
}