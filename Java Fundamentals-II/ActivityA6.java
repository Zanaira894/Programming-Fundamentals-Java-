import java.util.Scanner;
   public class ActivityA6{
      public static void main(String[] args){
      Scanner input= new Scanner(System.in);
      int weeks = 5;
      double payperrate = 15.50;
      double taxrate = 0.14;
      double clothesrate = 0.1;
      double suppliesrate = 0.01;
      double savingbondsrate = 0.25;
      double parentsbondsrate = 0.50;

      System.out.println("Enter the payrate for an hour:");
      double payrate = input.nextDouble();
      System.out.println("Enter the number of hours worked:");
      int hoursworked= input.nextInt();

      double incomebefore= payrate * hoursworked * weeks;
      double tax= incomebefore* taxrate;
      double incomeafter= incomebefore-tax;
      System.out.println("Income before tax: $" + incomebefore +"And Income after tax: $" + incomeafter);
      double clothes = incomeafter * clothesrate;
      double school = incomeafter * suppliesrate;
      double remaining = incomeafter - school - clothes;
      double savingbonds = remaining * savingbondsrate;
      double parentsbonds = savingbonds * parentsbondsrate;
      System.out.println("Money spend on clothes : $" + clothes);
      System.out.println("Money spend on school supplies : $" + school);
      System.out.println("Money spend on savingbonds : $" + savingbonds);
      System.out.println("Money spend by parents for buying additional saving bonds: $" + parentsbonds);
      input.close();
      }
   }
      
      
      