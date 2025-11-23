import java.util.Scanner;
public class lab1c{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter how many numbers are:");
    int N = input.nextInt();
    int sum = 0;
   
    for (int i = 1; i <= N; i++){
     System.out.print("Enter number" + i + ":");
     int num = input.nextInt();
     sum += num;
     }
     System.out.print("Sum =" + sum);
   }
}