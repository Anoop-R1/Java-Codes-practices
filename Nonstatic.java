
public class Nonstatic {
     static int b=10;
  static void d(){
    int a=20;
    
    System.out.print(a);
    System.out.println(b);
   }
   public static void main(String[] args) {
   d();
   }
}