import java.util.Scanner;

public class simple_intrest
{
   public static void main(String[] args)
   {
      float p, r, t, si;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the Principle Amount: ");
      p = scan.nextFloat();
      System.out.print("Enter the Rate of Interest: ");
      r = scan.nextFloat();
      System.out.print("Enter the Time Period (in Year): ");
      t = scan.nextFloat();
      
      si = (p*r*t)/100;
      System.out.println("\nSimple Interest = " +si);
   }
}