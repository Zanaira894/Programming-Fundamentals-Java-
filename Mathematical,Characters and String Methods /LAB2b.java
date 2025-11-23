import java.util.Scanner;
public class LAB2b{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a character:");
    char ch= input.next().charAt(0);
    System.out.println("The Unicode for the character  " + ch + "   is    " + (int) ch);
    }
}
