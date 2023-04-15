import java.util.Scanner;
public class loop
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter a Number: ");
      int num = scan.nextInt();
      System.out.print("Enter the Value of n: ");
      int n = scan.nextInt();
      System.out.println("\nPrinting " +num+ " for " +n+ " times:");
      for(int i=0; i<n; i++)
      System.out.print(num+ " ");
   }
}