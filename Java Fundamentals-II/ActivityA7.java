import java.util.Scanner;
     public class ActivityA7{
         public static void main (String[] args){
         Scanner sc = new Scanner(System.in);
         int priceA= 20;
         int priceB= 15;
         int priceC= 10;
         int priceD= 5;
        
         System.out.print("Enter the tickets sold for class A:");
         int a = sc.nextInt();
         System.out.print("Enter the tickets sold for class B:");
         int b = sc.nextInt();
         System.out.print("Enter the tickets sold for class C:");
         int c = sc.nextInt();
         System.out.print("Enter the tickets sold for class D:");
         int d = sc.nextInt();
         int incomeA= a * priceA;
         int incomeB= b * priceB;
         int incomeC= c * priceC;
         int incomeD= d * priceD;

         int Totalincome = incomeA + incomeB + incomeC + incomeD;
         System.out.println("Income from class A: $" +incomeA);
         System.out.println("Income from class B: $" +incomeB);
         System.out.println("Income from class C: $" +incomeC);
         System.out.println("Income from class D: $" +incomeD);
         System.out.println("Total income: $" +Totalincome);
         sc.close();
         }
      }

     