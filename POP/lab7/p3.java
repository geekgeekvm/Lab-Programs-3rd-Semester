import java.util.Scanner;
class Swap{
   int a,b;
   Swap(int a, int b){
      this.a=a;
      this.b=b;
   }
   
}
public class p3 {

   public static void main ( String[] args ) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter 2 numbers.");
      int a=s.nextInt();
      int b=s.nextInt();

      System.out.println ( "Value of a and b before calling swap() is "+a+" "+b);
      swap(a,b);
      System.out.println ( "Value of a and b after calling swap() is "+a+" "+b);

      Swap sw = new Swap(a,b);
      Swap(sw);
      System.out.println ( "Value of a and b after passing object is "+sw.a+" "+sw.b);

   }

   public static void swap ( int a, int b ) {
      int temp=a;
      a=b;
      b=temp;
   }

   public static void Swap ( Swap sw ) {
      int temp=sw.a;
      sw.a=sw.b;
      sw.b=temp;
   }


} 