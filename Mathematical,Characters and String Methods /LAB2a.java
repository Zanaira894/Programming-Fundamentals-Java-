import java.util.Scanner;
public class LAB2a{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an ASCII code:");
    int code = input.nextInt();
    if(code>=0 && code<=127)
       System.out.print("The character for ASCII code" + code + " is " + (char)code);
    else
       System.out.print("Invalid ASCII code!");
    }
}
    
    
