import java.util.Scanner;
   public class ActivityA2{
      public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the number of students:");
       int N= input.nextInt();
      
       System.out.println("Enter the number of apples:");
       int K = input.nextInt();

       int Perstudent= K/N;
       int remainingapples= K%N;
       
       System.out.println("Each student gets:"+ Perstudent + "apples");
       System.out.println("The number of remaining apples in the basket is"+ remainingapples);
       input.close();
    }
}