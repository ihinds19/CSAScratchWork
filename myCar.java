import java.util.Scanner;


public class myCar {
   public static void main(String[] args) {
   
   Scanner scan = new Scanner(System.in);
   
   
   //declaring variables
   String carBrand = "Subaru";
   int milesDriven07 = 0;
   boolean isSilver = true;
   double gallonsInTank = 15.9;
   int milesDrivenNow;
   
   System.out.println ("in 2007 my subaru outback had " + milesDriven07 + " miles on it");
   
   System.out.println("how many miles driven does it have today");
   milesDrivenNow = scan.nextInt();
   
   System.out.println (milesDrivenNow);

   
   
   }
}