import java.util.Scanner;
public class LAB1b{
   public static int reverse(int number){
    int digit;
    int reversed= 0;
    while(number!=0){
    digit= number%10;
    reversed = reversed * 10 + digit;
    number/=10;
   }
   return reversed;
}
public static void main(String[] args){
   Scanner input = new Scanner(System.in);
    int number;
    System.out.println(" Enter an integer:");
    number= input.nextInt();
    int reversed = reverse(number);
    System.out.print("Reversed number: " + reversed);
   }
}
   
