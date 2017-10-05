import java.util.Scanner;

class Area{
	double area;
	public int Area(){
		return 5;
	}
	Area(float a){
		area=a*a;
	}
	Area(double a, int constant){
		area=constant*a*a;
	}
	Area(float a,float b){
		area=a*b;
	}
	Area(float r, int constant){
		area=3.14*r*r*constant;
	}
	Area(double r, double h){
		area=3.14*r*h+2*3.14*r;
	}
	public double ShowArea(){
		return area;
	}

}

public class p6{
	public static void main(String[] args){
		System.out.println("Choose: \n1.Square \n2.Cube \n3.Rectangle \n4.Sphere \n5.Cylinder");
		Scanner s = new Scanner(System.in);
		int ch=s.nextInt();
		switch(ch){
		case 1:		Area a = new Area(5);
					System.out.println(a.ShowArea());                                                                                                                                                                                                                                                                                                                                                                                                                                             
					break;
		case 2:		Area b = new Area(5,6);
					System.out.println(b.ShowArea());                                                                                                                                                                                                                                                                                                                                                                                                                                             
					break;
		case 3:		Area c = new Area(5);
					System.out.println(c.ShowArea());                                                                                                                                                                                                                                                                                                                                                                                                                                             
					break;
		case 4:		Area d = new Area(5);
					System.out.println(d.ShowArea());                                                                                                                                                                                                                                                                                                                                                                                                                                             
					break;
		case 5:		Area e = new Area(5);
					System.out.println(e.ShowArea());                                                                                                                                                                                                                                                                                                                                                                                                                                             
					break;
		default:	break;
	}
}
}