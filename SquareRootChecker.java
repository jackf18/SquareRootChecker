import java.util.Scanner;

public class SquareRootChecker{

   public static void main(String[] args){
      Scanner scnr = new Scanner(System.in);
      System.out.println("Type an integer.");
      int int1 = scnr.nextInt();
      if (int1 > -1){
      System.out.println("The square root of " + int1 + " is " + Math.sqrt(int1));
      } else {
      System.out.println("Error!");
      }
      
      
      
   }
      
}