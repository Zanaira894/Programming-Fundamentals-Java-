import java.util.Scanner;
   public class LabTask7{
     public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter the length and width of first rectangle:");
       int L1= sc.nextInt();
       int W1= sc.nextInt(); 
    
       System.out.print("Enter the length and width of second rectangle:");
       int L2= sc.nextInt();
       int W2= sc.nextInt();
       int arearectangle1 = L1*W1;
       int arearectangle2 = L2*W2;

       if (arearectangle1>arearectangle2)
       System.out.println("First rectangle has greater area.");
       else
       System.out.println("Second rectangle has greater area.");
     }
   }  

