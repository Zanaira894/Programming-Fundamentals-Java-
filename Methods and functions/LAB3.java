import java.util.Scanner;
 
public class LAB3{
 public static void displaySortedNumbers(double num1,double num2,double num3){
  double temp;

  if(num1>num2){
    temp = num1;
    num1 = num2;
    num2 = temp;
   }
  if(num2>num3){
    temp = num2;
    num2 = num3;
    num3 = temp;
   }
  if(num1>num2){
    temp = num1;
    num1 = num2;
    num2 = temp;
   }
 System.out.println("Sorted numbers:" + num1 + " ," + num2 + " ," + num3);
 }
public static void main(String[] args){
  double num1,num2,num3;
  Scanner input = new Scanner(System.in);
   System.out.print("Enter three numbers:");
   num1 = input.nextDouble();
   num2 = input.nextDouble();
   num3 = input.nextDouble();
 displaySortedNumbers(num1, num2, num3);
}
}

      
