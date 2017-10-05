class F{
	int a;
	F(int a){
	this.a=a;
	System.out.println("This is obj "+a);
	}
	protected void finalize(){
	System.out.println("Killing it");
	}
}

public class p4{
	public static void main(String[] args){
		
		for(int i=1;;i++){
			F f = new F(i);
		}
	}	
	
}