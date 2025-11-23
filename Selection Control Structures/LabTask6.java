import java.util.Scanner;

public class LabTask6{
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a number (1-10):");
     int num= sc.nextInt();

     String[] roman= {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
    
     if (num>=1 && num<=10)
         System.out.println("ROMAN numeral:" + roman[num-1]);
     else
         System.out.println("Error: number out of range!");
   }
}