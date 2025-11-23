import java.util.Scanner;
   public class LabTask9{
     public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter the number of pennies:");
       int pennies= sc.nextInt();
       System.out.print("Enter the number of nickels:");
       int nickels= sc.nextInt();
       System.out.print("Enter the number of dimes:");
       int dimes= sc.nextInt();
       System.out.print("Enter the number of quarters:");
       int quarters= sc.nextInt();

       int totalcents= pennies+nickels*5+dimes*10+quarters*25;
        
       if (totalcents ==100) 
            System.out.println("Congratulations! You made exactly one dollar!");
        else if (totalcents <100) 
            System.out.println("Sorry!amount entered is less than one dollar!");
        else 
            System.out.println("Sorry!amount entered is more than one dollar!");
    }
}