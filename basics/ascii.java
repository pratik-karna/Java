import java.util.Scanner;
public class ascii {
    public static void main(String[] args)
   {
      char ch;
      int ascii;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter a Character: ");
      ch = scan.next().charAt(0);
      
      ascii = ch;
      System.out.println("\nASCII Value = " +ascii);
   }
}
